package Automation;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.utils.CloneUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //maximize() 设置浏览器最大化
        //setSize() 设置浏览器宽高
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(480, 800));
        //刷新页面
        driver.navigate().refresh();
//        clear() 清除文本
//        sendKeys(*value) 模拟按键输入。
//        click() 单击元素
//        getSize() 返回元素的尺寸。
//        getText() 获取元素的文本。
//        getAttribute(name) 获得属性值。
//        isDisplayed() 设置该元素是否用户可见。
//        submit()模拟回车操作
//        contextClick() 右击
//        clickAndHold() 鼠标点击并控制
//        doubleClick() 双击
//        dragAndDrop() 拖动
//        release() 释放鼠标
//        perform() 执行所有Actions中存储的行为
// 鼠标右键点击指定的元素
//        Actions action=new Actions(driver);
//        action.contextClick(driver.findElement(By.id("element"))).perform();

// 鼠标双击指定的元素
//        action.doubleClick(driver.findElement(By.id("element"))).perform();

// 鼠标拖拽动作， 将 source 元素拖放到 target 元素的位置。
//        WebElement source = driver.findElement(By.name("element"));
//        WebElement target = driver.findElement(By.name("element"));
//        action.dragAndDrop(source,target).perform();
// 释放鼠标
//        action.release().perform();
        WebElement input = driver.findElement(By.id("kw"));
        //输入框输入内容
        input.sendKeys("seleniumm");
        Thread.sleep(2000);

        //删除多输入的一个 m
        input.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);

        //输入空格键+“教程”
        input.sendKeys(Keys.SPACE);
        input.sendKeys("教程");
        Thread.sleep(2000);

        //ctrl+a 全选输入框内容
        input.sendKeys(Keys.CONTROL, "a");
        Thread.sleep(2000);

        //ctrl+x 剪切输入框内容
        input.sendKeys(Keys.CONTROL, "x");
        Thread.sleep(2000);

        //ctrl+v 粘贴内容到输入框
        input.sendKeys(Keys.CONTROL, "v");
        Thread.sleep(2000);

        //通过回车键盘来代替点击操作
        input.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
//        getTitle()： 用于获得当前页面的title。
//        getCurrentUrl() ： 用户获得当前页面的URL。
//        getText() 获取页面文本信息。
        //页面加载超时时间设置为 5s
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        //定位对象时给 10s 的时间, 如果 10s 内还定位不到则抛出异常
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //异步脚本的超时时间设置成 3s
        driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
        //java中的length属性是针对数组说的,比如说你声明了一个数组,想知道这个数组的长度则用到了length这个属性.
        //java中的length()方法是针对字符串String说的,如果想看这个字符串的长度则用到length()这个方法.
        //java中的size()方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看!
        //获得当前窗口句柄
        String search_handle = driver.getWindowHandle();
        //获得所有窗口句柄
        Set<String> handles = driver.getWindowHandles();
        //判断是否为注册窗口， 并操作注册窗口上的元素
        for (String handle : handles) {
            if (handle.equals(search_handle) == false) {
                //切换到注册页面
                driver.switchTo().window(handle);
                //关闭当前窗口
                driver.close();
            }
        }
        //<select>标签的下拉框选择
        WebElement el = driver.findElement(By.xpath("//select"));
        Select sel = new Select(el);
        sel.selectByValue("20");
        //getText()： 返回 alert/confirm/prompt 中的文字信息。
        //accept()： 接受现有警告框。
        //dismiss()： 解散现有警告框。
        //sendKeys(keysToSend)： 发送文本至警告框。
        //keysToSend： 将文本发送至警告框。
        //接收弹窗
        driver.switchTo().alert().accept();
        //定位上传按钮， 添加本地文件
        driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
        //获得 cookie
        Set<Cookie> coo = driver.manage().getCookies();
        //删除所有 cookie
        //driver.manage().deleteAllCookies();
        //设置浏览器窗口大小
        driver.manage().window().setSize(new Dimension(700, 600));
        //将页面滚动条拖到底部
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
        //获取窗口截图
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("d:\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/**
 * @param :admin
 * Selenium+Map
 * put(K key,V value) :向Map中追加数据
 * get(Obiect key) :根据key获取对应的value值，没有返回null
 * Set<Integer> set = map.keySet(); :获取所有Key，key不能重复
 * Collection<String> value=map.values(); :获取所有value值，可以重复
 * map1.putAll(map2); :相同的key，map1中的key-value会被覆盖；不同的key，map2中的key-value会被追加到map1
 * map1=map2； ：map1中的key-value都会被map2中的key-value覆盖
 * */
/**
 * @param :admin
 * elementToBeClickable(By locator):页面元素是否在页面上可用和可被单击
 * elementToBeSelected(WebElement element):页面元素处于被选中状态
 * presenceOfElementLocated(By locator):页面元素在页面中存在
 * textToBePresentInElement(By locator):在页面元素中是否包含特定的文本
 * textToBePresentInElementValue(By locator, java.lang.String text):页面元素值
 * titleContains(java.lang.String title):标题 (title)
 * */