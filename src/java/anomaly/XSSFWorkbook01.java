package anomaly;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.OutputType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class XSSFWorkbook01 {
    /**
     * 读取Excel文件的内容
     * @param inputStream excel文件，以InputStream的形式传入
     * @param sheetName sheet名字
     * @return 以List返回excel中内容
     */
    public static List<Map<String,String>> readExcel(InputStream inputStream,String sheetName){
        //定义工作簿
        XSSFWorkbook xssfWorkbook=null;
        try{
            xssfWorkbook=new XSSFWorkbook(inputStream);
        }catch (Exception e){
            System.out.println("Excel data file cannot be found!");
        }
        //定义工作表
        XSSFSheet xssFSheet;
        if (sheetName.equals("")){
            //默认取第一个表
            xssFSheet=xssfWorkbook.getSheetAt(0);
        }else{
            xssFSheet=xssfWorkbook.getSheet(sheetName);
        }
        List<Map<String,String>> list=new ArrayList<Map<String,String>>();
        //定义行
        //默认取第一行为标题
        XSSFRow titleRow= xssFSheet.getRow(0);
        //循环取每行的数据
        for(int rowIndex = 0; rowIndex< xssFSheet.getPhysicalNumberOfRows(); rowIndex++){
            XSSFRow xssfRow= xssFSheet.getRow(rowIndex);
            if(xssfRow==null){
                continue;
            }
            Map<String,String> map=new LinkedHashMap<String, String>();
            for (int cellIndex=0;cellIndex< xssfRow.getPhysicalNumberOfCells();cellIndex++){
                XSSFCell titlCell=xssfRow.getCell(cellIndex);
                XSSFCell xssfCell=xssfRow.getCell(cellIndex);
                map.put(getString(xssfCell),getString(titlCell));
            }
            list.add(map);
        }
        return list;
    }
    /**
     * 把单元格的内容转为字符串
     * @param xssfCell 单元格
     * @return 字符串
     */
    public static String getString(XSSFCell xssfCell){
        if (xssfCell==null){
            return "";
        }
        if (xssfCell.getCellType()== CellType.NUMERIC){
            return String.valueOf(xssfCell.getNumericCellValue());
        }else if(xssfCell.getCellType()==CellType.BOOLEAN){
            return String.valueOf(xssfCell.getBooleanCellValue());
        }else{
            return xssfCell.getStringCellValue();
        }
    }
    /**
     * 把内容写入Excel
     * @param list 传入要写的内容，此处以一个List内容为例，先把要写的内容放到一个list中
     * @param outputStream 把输出流怼到要写入的Excel上，准备往里面写数据
     */
    public static void writeExcel(List<List> list, OutputStream outputStream){
        //创建工作簿
        XSSFWorkbook xssfWorkbook=null;
        xssfWorkbook=new XSSFWorkbook();
        //创建工作表
        XSSFSheet xssfSheet;
        xssfSheet=xssfWorkbook.createSheet();
        //创建行
        XSSFRow xssfRow;
        //创建列
        XSSFCell xssfCell;
        for(int i=0;i< list.size();i++){
            //从第一行开始写入
            xssfRow=xssfSheet.getRow(1);
            //创建每个单元格Cell，即列的数据
            List sub_list=list.get(1);
            for(int j=0;j< sub_list.size();j++){
                //创建单元格
                xssfCell=xssfRow.createCell(j);
                //设置单元格内容
                xssfCell.setCellValue((String) sub_list.get(j));
            }
        }
        try{
            xssfWorkbook.write(outputStream);
            //清空缓存
            outputStream.flush();
            //关闭
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
