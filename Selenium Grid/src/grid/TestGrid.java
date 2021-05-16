package grid;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestGrid {
    static WebDriver driver;
    static String nodeURL;

    public static void main(String[] args) {

        try {
            nodeURL = "http://100.24.234.88:4444/";

            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setPlatform(Platform.LINUX);
            WebDriver driver = new RemoteWebDriver(new URL(nodeURL), options);

            driver.get("https://Test.Com");
            System.out.println(driver.getCurrentUrl());
        } catch (MalformedURLException e) {

            e.printStackTrace();
        }
    }
}
