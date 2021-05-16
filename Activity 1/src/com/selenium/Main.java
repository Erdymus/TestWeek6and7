package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jars and drivers\\Drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	//opens google.com
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#L2AGLb")).click();

	//finds the search area
    WebElement element = driver.findElement(By.name("q"));
    //inserts text into search area
    element.sendKeys("Software Testing");
    Thread.sleep(2000);
    element.sendKeys(Keys.ENTER);

    //added a wait time before the browser closes
    Thread.sleep(4000);
    driver.close();
    }
}
