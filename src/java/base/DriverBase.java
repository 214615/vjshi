package automation;

import java.util.concurrent.TimeUnit;

public class DriverBase {
    /**
     * 获取chrome驱动
     *
     * @param url 网页链接
     * @return 驱动
     */
    public static ChromeDriver getDriver(String url) {
        return getDriver(url, 8);
    }

    /**
     * 获取chrome驱动
     *
     * @param url     网页链接
     * @param timeOut 通用超时时间
     * @return 驱动
     */
    public static ChromeDriver getDriver(String url, long timeOut) {
        ChromeOptions chromeOptions = new ChromeOptions();
        if (!System.getProperty("os.name").contains("Windows")) {
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("window-size=1920x1080");
            System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
        } else
            chromeOptions.addArguments("user-data-dir=C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\Selenium User Data");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
        return driver;
    }
}
