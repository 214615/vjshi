package okhttp3;

import base.DataBase;
import org.testng.annotations.DataProvider;

public class ParaMeter {
    @DataProvider(name="parameter ")
    public Object[] parameter() throws Exception{
        return DataBase.getExcelData("",Lncoming.class);
    }
}
