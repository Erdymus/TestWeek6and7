package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Node2 {

    WebDriver driver;
    String nodeURL;


    @Test
    public void f() {

        try {
            nodeURL = "http://100.24.234.88:4444/";

            FirefoxOptions options = new FirefoxOptions();
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