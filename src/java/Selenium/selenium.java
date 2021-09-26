package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class selenium {
        WebDriver driver=new FirefoxDriver();
        @Test(groups = "a1")
        public void main1() throws InterruptedException{
//        WebDriver driver=new ChromeDriver();
//        WebDriver driver=new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);//页面加载时间
//        driver.get("https://www.blockbox.ink");
            driver.get("https://www.baidu.com");
            driver.manage().window().maximize();//控制浏览器窗口大小
            String search_test= driver.getWindowHandle();//获取当前窗口句柄
            driver.findElement(By.xpath("(//a[@name='tj_login'])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[@target='_blank'])[34]")).click();
            System.out.printf("now accesss %s \n", driver.getCurrentUrl());//getCurrentUrl()获取url
            System.out.printf("now accesss %s \n",driver.getTitle());//获取网页标题
//        WebElement search_text=driver.findElement(By.id("kw"));
//        search_text.sendKeys("slenium");
//        search_text.submit();
            Set<String> handler= driver.getWindowHandles();//获取所有窗口句柄
            for(String handle:handler){
                if(handle.equals(search_test)==false){
                    driver.switchTo().window(handle);//切换到注册页面
                    Thread.sleep(2000);
                    driver.findElement(By.name("userName")).clear();//clear()清空
                    driver.close();//关闭当前窗口
                }
            }
            for(String hand:handler){
                if(hand.equals(search_test)==true){
                    driver.switchTo().window(hand);
                    driver.findElement(By.xpath("//a[contains(@id,'closeBtn')]")).click();
                }
            }
            Thread.sleep(2000);
            driver.switchTo().window(search_test);
            driver.findElement(By.xpath("(//span[contains(.,'设置')])[1]")).click();
            driver.findElement(By.xpath("(//a[@href='javascript:;'])[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='nr_2']")).click();
//        WebElement e1=driver.findElement(By.xpath("//select"));
//        Select se1=new Select(e1);
//        se1.selectByValue("20");
//        List<WebElement> search_test= driver.findElements(By.xpath("//div/div/h3"));
//        System.out.println(search_test.size());//打印元素个数
//            for(WebElement search:search_test) {
//                System.out.println(search.getText());//循环打印搜索结果标题
//            }
//        WebElement text=search_test.get(search_test.size()-10);
//            System.out.println(text.getText());//打印第N结果的标题
//        driver.findElement(By.xpath("//a[contains(.,'找创作人')]")).click();
//        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
//        driver.navigate().back();//浏览器后退
//        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
//        driver.navigate().forward();//浏览器前进
//        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
//        driver.navigate().refresh();//刷新页面
//            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//定位元素给的时间
//        driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]")).click();
//        driver.findElement(By.xpath("//span[contains(.,'其他登录方式')]")).click();
//        driver.findElement(By.xpath("(//p[@class='chakra-text css-slgxiy'])[3]")).click();//定位元素方法：id()、name()、classname()、tagName()、linkText()、xpath()
//        WebElement a = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
//        System.out.printf("now accesss %s \n",a.getSize());//获取元素大小
//        System.out.printf("now accesss %s \n",a.getText());//获取元素文本
//        System.out.printf("now accesss %s \n",a.getAttribute("type"));//获取属性值
//        System.out.printf("now accesss %s \n",a.isDisplayed());//查看返回结果是否可见
//        a.sendKeys("15892587377");//输入
//        a.clear();//清除文本
//        a.submit();//键盘回车操作
//        Actions actions=new Actions(driver);
//        actions.contextClick(a).perform();//鼠标右键点击指定元素
//        actions.doubleClick(a).perform();//鼠标双击指定元素
//        actions.dragAndDrop(a,b).perform();//鼠标拖拽作用
//        actions.release().perform();//释放鼠标
//        a.sendKeys(Keys.BACK_SPACE);//删除
//        a.sendKeys(Keys.SPACE);//空格
//        a.sendKeys(Keys.CONTROL,"a");//全选
//        a.sendKeys(Keys.CONTROL,"x");//剪切
//        a.sendKeys(Keys.CONTROL,"c");//复制
//        a.sendKeys(Keys.CONTROL,"v");//粘贴
//        a.sendKeys(Keys.ENTER);//回车
            driver.switchTo().alert().accept();//接收弹窗
//############显示等待###########
//        WebDriverWait uitl=new WebDriverWait(driver,10,1);
//        uitl.until(new ExpectedCondition<WebElement>() {
//                       @Override
//                       public WebElement apply(WebDriver text) {
//                           return text.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
//                       }
//                   }).sendKeys("");
//        driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);//异步脚本的超时时间(异步脚本：发送请求，不等待返回结果，就执行下一步；同步脚本：发送请求，必须等到返回结果，才会执行下一步)
            Thread.sleep(2000);//等待时间
            driver.quit();
        }
}
