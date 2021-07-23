package automation;
//#########get请求##############
//public class SimpleClient {
//    @Test
//    public void testGet(){
//        //创建OkHttpClient实例对象
//        OkHttpClient okHttpClient = new OkHttpClient();
//        //创建Request对象
//        Request request = new Request.Builder()
//                .url("http://139.224.7.25:6677/stats/search-times")
//                .addHeader("key","value")
//                .get()
//                .build();
//        //执行Request请求
//        //异步请求
////    okHttpClient.newCall(request).enqueue(new Callback() {
////        @Override
////        public void onFailure(Call call, IOException e) {
////            //请求失败
////        }
////        @Override
////        public void onResponse(Call call, Response response) throws IOException {
////            //请求成功
////            System.out.println("TestOkHttp:"+response.body().string());
////        }
////    });
//        //同步请求
//        try {
//            Response response = okHttpClient.newCall(request).execute();
//            System.out.println(response.body().string());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

//###########post请求#############
///**
// * @author admin
// */
//public class SimpleClient {
//    @Test
//    public void testpost(){
//        OkHttpClient okHttpClient=new OkHttpClient();
//        //请求头
//        MediaType mediaType=MediaType.parse("application/json;charset=UTF-8");
////        RequestBody requestBody=RequestBody.create(mediaType,"{}");
//        //表格格式
////        RequestBody requestBody=new RequestBody.Builder();
//        //json格式
//        Gson gson=new Gson();
//        RequestBody requestBody=RequestBody.create(mediaType,"{\"description\":\"电商广告\",\"partAMobile\":\"15892587377\",\"partAName\":\"zjp\"}");
//        Request request=new Request.Builder()
//                .url("http://139.224.7.25:6677/cost/assess")
//                .post(requestBody)
//                .build();
//        try{
//            Response response=okHttpClient.newCall(request).execute();
//            System.out.println(response.body().string());
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
public class SimpleClient {
    @Test
    public void run() throws IOException{
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder()
                .url("https://api.github.com/repos/square/okhttp/issues")
                .header("User-Agent", "OkHttp Headers.java")
                .addHeader("Accept", "application/json; q=0.5")
                .addHeader("Accept", "application/vnd.github.v3+json")
                .build();
        try(Response response=okHttpClient.newCall(request).execute()){
            if(!response.isSuccessful()) {
                throw new IOException("Unexpected code" + response);
            }
            System.out.println("Server:"+response.header("Server"));
            System.out.println("Date:"+response.header("Date"));
            System.out.println("Server:"+response.headers("Server"));
        }
    }
}
