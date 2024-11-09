package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Base64;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static String takeScreenshotAsBase64(){
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        return ts.getScreenshotAs(OutputType.BASE64);
    }

}
