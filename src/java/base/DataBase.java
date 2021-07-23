package base;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

public class DataBase {
        /**
         * 获取表格数据并进行格式化
         *
         * @param sheetName 表格名称
         * @throws Exception
         */
        public static Object[] getExcelData(String sheetName, Class o) throws Exception {
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/dataProvider/selenium_data.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            //获取列名
            List<String> name = new ArrayList<>();
            Row nameRow = sheet.getRow(0);
            for (Cell cell : nameRow)
                name.add(cell.toString());
            //获取首行以外所有数据
            ArrayList<HashMap<String, String>> dataList = new ArrayList<>();
            DecimalFormat format = new DecimalFormat("0");
            for (int v = 1; v <= sheet.getLastRowNum(); v++) {
                Row tempRow = sheet.getRow(v);
                HashMap<String, String> tempMap = new HashMap<>();
                //获取当前行数据
                for (int v1 = 0; v1 < tempRow.getLastCellNum(); v1++)
                    //将数值类型进行格式化，去掉小数
                    tempMap.put(name.get(v1), tempRow.getCell(v1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType() == CellType.NUMERIC ? format.format(tempRow.getCell(v1).getNumericCellValue()) : tempRow.getCell(v1).toString());
                if (Boolean.parseBoolean(tempMap.get("enabled")))
                    dataList.add(tempMap);
            }
            //进行反序列化
            Gson gson = new Gson();
            Object[] objects = new Object[dataList.size()];
            for (int i = 0; i < dataList.size(); i++)
                objects[i] = gson.fromJson(gson.toJson(dataList.get(i)), o);
            inputStream.close();
            return objects;
        }
    }

