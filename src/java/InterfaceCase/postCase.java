package InterfaceCase;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;


public class postCase {
    @Test
    public static void senfPost(String url,String param) throws Exception{
        PrintWriter out=null;
        BufferedReader in=null;
        try{
            URL reaurl=new URL(url);
            URLConnection connection= reaurl.openConnection();
            //设置通用请求参数
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            //发送Post请求必须设置如下两行
            connection.setDoOutput(true);
            connection.setDoInput(true);
            out=new PrintWriter(connection.getOutputStream());
            //发送请求参数
            out.print(param);
            //flush输出流缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (out!=null)
                out.close();
            if (in!=null)
                in.close();
        }
    }
}
