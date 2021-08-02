package InterfaceCase;

import javax.print.DocFlavor;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GteCase {
    public static String sendget(String url,String param) throws Exception{
        String result="";
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
                result+=line;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
                if(in!=null)
                in.close();
        }
        return result;
    }
    public static String sendPost(String url,String param) throws Exception {
        PrintWriter out=null;
        BufferedReader in=null;
        String result="";
        try{
            URL reaUrl=new URL(url);
            URLConnection connection= reaUrl.openConnection();
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            connection.setRequestProperty("","");
            //发送Post请求必须设置
            connection.setDoOutput(true);
            connection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out =new PrintWriter(connection.getOutputStream());
            // 发送请求参数
            out.print(param);
            //输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line=in.readLine())!=null){
                result +=line;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
        return result;
    }
}

