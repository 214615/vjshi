package Automation;

import org.testng.annotations.Test;

//异常测试
public class testng {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :" + i);
    }
}
//    @Test(enabled = false)//忽略测试
//    public void TestNgLearn1(){
//        System.out.println("this is TestNG test case1");
//    }
//    @Test
//    public void TestNgLearn2(){
//        System.out.println("this is TestNG test case2");
//    }
//    @Test(timeOut = 5000)//超时测试(主要用于性能测试)
//    public void testThisShouldPass() throws InterruptedException{
//        Thread.sleep(4000);
//    }
//    @Test(timeOut = 6000)
//    public void testThisShouldFail(){
//        while (true);
//    }
//    @Test(groups = "groups1")
//    public void test1(){
//        System.out.println("test1 from group1");
//        Assert.assertTrue(true);
//    }
//    @Test(groups = "groups1")
//    public void test2(){
//        System.out.println("test2 from groups1");
//        Assert.assertTrue(true);
//    }
//    @Test(groups = "groups3")
//    public void test3(){
//        System.out.println("test3 from groups3");
//        Assert.assertTrue(true);
//    }
//    @BeforeTest//先执行这个，再执行其他//注释的方法将在属于test标签内的类的所有测试方法运行之前运行
//    public void beforetest(){
//        System.out.println("beforetest");
//    }
//    @AfterTest//先执行其他，在执行这个//注释的方法将在属于test标签内的类的所有测试方法运行之后运行
//    public void aftertest(){
//        System.out.println("aftertest");
//    }
//    @BeforeClass//BeforeTest()和BeforeClass()先执行Test再执行class//在调用当前类的第一个测试方法之前运行，注释方法仅运行一次
//    public void befireclass(){
//        System.out.println("beforeclass");
//    }
//    @AfterClass//AfterClass()和AfterTest()先执行class再执行test//在调用当前类的第一个测试方法之后运行，注释方法仅运行一次
//    public void afterclass(){
//        System.out.println("afterclass");
//    }
//    @BeforeSuite//BeforeTest()和BeforeClass()和BeforeSuite()先执行suite再执行test最后class//在该套件的所有测试都运行在注释的方法之前，仅运行一次
//    public void beforesute(){
//        System.out.println("beforesuite");
//    }
//    @AfterSuite//AfterClass()和AfterTest()和AfterSuite()先执行class再执行test最后suite//在该套件的所有测试都运行在注释方法之后，仅运行一次
//    public void afterstuite(){
//        System.out.println("aftersuite");
//    }
//    @BeforeGroups(groups = "groups1")//指定在哪一个前面执行
//    public void groups(){
//        System.out.println("beforegroups");
//    }
//    @AfterGroups(groups = "groups1")//指定在哪一个后面执行
//    public void aftergroups(){
//        System.out.println("aftergroups");
//    }
//    @BeforeMethod//在每个测试方法执行之前执行
//    public void befooremethod(){
//        System.out.println("beforemethod");
//    }
//    @AfterMethod//在每个测试方法之后执行
//    public void aftermethod(){
//        System.out.println("aftermethod");
//    }
    //###########传参数############
    //第一种
//    @Test(enabled = true)
//    @Parameters({"param1","param2"})
//    public void text(String param1,String param2){
//        System.out.println("this is"+param1+"; my name is"+param2);
//        Assert.assertFalse(false);
//    }
//    @Test(dependsOnMethods = "text")
//    public void test(){
//        System.out.println("yes");
//    }
//    //第二种
//    @DataProvider(name="test1")
//    public Object[][] str1(){
//        return new Object[][] {{"年龄","21"},{"籍贯","四川"},{"学历","大专"}};
//    }
//    @Test(dataProvider = "test1")
//    public void str1(String param1,String param2){
//        System.out.println("this is"+param1+"; my name is"+param2);
//        Assert.assertFalse(false);
//    }
//##########被依赖#########
//    @Test(enabled = true)
//    public void test(){
//        System.out.println("this is A");
//        Assert.assertTrue(true);
//    }
//    @Test(alwaysRun = true,dependsOnMethods = {"test"})//alwaysRun=true设置为软依赖，软依赖：被依赖的测试方法执行失败与否，都不影响测试方法，依然继续执行
//    public void test1(){
//        System.out.println("this is B");
//    }
//    @Test(groups = "txt")
//    public void str(){
//        System.out.println("this is ok");
//    }
//    @Test(groups = "txt")
////    @Test(dataProvider = "test1")
//    public void ser(){
//        System.out.println("this is ");
//    }
//    @Test(dependsOnGroups = {"txt.*"})
//    public void dj(){
//        ser();
//    }
//    @Test
//    public void testa1(){
//        System.out.println("this is ");
//    }
//    @Test
//    public void testa2(){
//        System.out.println("ok");
//    }
//    @Test
//    public void testa4(){
//        System.out.println("pp");
//    }
//    @Test(dependsOnMethods = "testa1")
//    public void testa3(){
//    }
//}
//public class testng {
//    public static OkHttpClient client=new OkHttpClient();//默认设置共享实例
//    public static void main(String[] args) throws IOException {
//        client=new OkHttpClient();
//        Request request=new Request.Builder()
//                .url("http://www.baidu.com")
//                .build();
//        final Call call=client.newCall(request);
//        Response response= client.newCall(request).execute();
//        if  (!response.isSuccessful()) {
//            throw  new  IOException( "服务器端错误: "  + response);
//        }
//        Headers responseHeaders = response.headers();
//        for  ( int  i =  0 ; i < responseHeaders.size(); i++) {
//            System.out.println(responseHeaders.name(i) +  ": "  + responseHeaders.value(i));
//        }
//        System.out.println(response.body().string());
//    }
//    public static void main(String[] args){
//        try{
//            Request request=new Request.Builder()
//                    .get()
//                    .url("http://www.blockbox.ink")
//                    .build();
//            Response response=client.newCall(request).execute();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}