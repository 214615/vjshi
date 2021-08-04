package okhttp3;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class OkhttpClientGet {
    /*
    //动态创建OkHttpClient
    public final OkhttpClient okhttpClient=new OkhttpClient();*/
    @Test(dataProviderClass = ParaMeter.class,dataProvider = "parameter ",enabled = true)
    public void parameter(Lncoming line) {
        Map<String, String> requestPayload = new HashMap<>();
        requestPayload.put("description", line.getDescription());
        requestPayload.put("partAName", line.getPartAName());
        requestPayload.put("partAMobile", line.getPartAMobile());
        Gson gson = new Gson();;
        //获取文本类型
        MediaType mediaType = MediaType.parse("application/json");
        //获取body
        String body = gson.toJson(requestPayload);
        //将body添加到responseBody
        RequestBody responseBody = RequestBody.create(mediaType, body);
        Request request = new Request.Builder()
                .url("http://139.224.7.25:6677/cost/assess")
                .post(responseBody)
                .build();
        OkHttpClient client = new OkHttpClient();
        try {
            Response response =client.newCall(request).execute();
            Assert.assertEquals(response.code(),400,"err|测试未通过:未提示错误信息");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test(enabled = false)
    public void sendget(){
        Request request = new Request.Builder()
                .url("https://vapi.vjshi.com/users/active")
                .get()
                .build();
        OkHttpClient client=new OkHttpClient();
            //执行同步请求;execute():执行
        try{
            Response  response=client.newCall(request).execute();
            String josnbody=response.body().string();
            JsonObject jsonObject= JsonParser.parseString(josnbody).getAsJsonObject();
            System.out.println(jsonObject.get("value"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
