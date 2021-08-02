package InterfaceCase;

import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class gteCase {
    @Test
    public static String sendget(String url,String param) throws Exception{
        String reaurl="";
        BufferedReader in=null;
        try{
            String urlNameString=url+"?"+param;
            URL reaUrl=new URL(urlNameString);
            //打开和url直接的连接
            //通过调用URL对象openConnection()方法来创建URLConnection对象
            URLConnection connection= reaUrl.openConnection();
            //设置通用的请求属性
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            //开始访问
            connection.connect();
            //获取所有响应头字段
            Map<String, List<String>> map=connection.getHeaderFields();
            //遍历所有响应头信息
            for (String key:map.keySet()) {
                System.out.println(key + "-->" + map.get(key));
            }
            //定义BufferedReader输入流来读取url的响应
            in= new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            //readLine()读取文件内容
            while ((line=in.readLine())!=null){
                reaurl +="\b"+line;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
                if(in!=null)
                in.close();
        }
        return reaurl;
    }
}

