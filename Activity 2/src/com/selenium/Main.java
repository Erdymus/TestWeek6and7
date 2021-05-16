package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium jars and drivers\\Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //opens webpage
        driver.get("https://www.actitime.com/");
        Thread.sleep(4000);
        driver.findElement(By.id("cookie-button--got-it")).click();
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Try Free')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Hans");
        driver.findElement(By.id("last-name")).sendKeys("Solo");
        driver.findElement(By.id("email")).sendKeys("Millenium@Falcon.com");
        Thread.sleep(4000);

        driver.close();
    }
}
