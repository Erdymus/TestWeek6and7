package grid;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestGrid {
    static WebDriver driver;
    static String nodeURL:

    public static void main(String[] args) {
        try {
            node URL = "";

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.ANY);
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

            driver.get("http://www.google.com");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#L2AGLb")).click();

            //finds the search area
            WebElement element = driver.findElement(By.name("q"));
            //inserts text into search area
            element.sendKeys("Software Testing");
            Thread.sleep(2000);
            element.sendKeys(Keys.ENTER);

    }   catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
