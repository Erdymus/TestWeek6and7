package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium jars and drivers\\Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //opens webpage
        driver.get("https://adlibris.com/se/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(text(),'Jag förstår')]")).click();

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("praktisk mjukvarutestning");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Till kassan")).click();
        Thread.sleep(4000);
        driver.close();
    }
}
