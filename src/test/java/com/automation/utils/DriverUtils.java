package com.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtils {
    //    public static final String USERNAME = ConfigReader.getProperty("bs.username");
//    public static final String AUTOMATE_KEY = ConfigReader.getProperty("bs.key");
//    public static final String URL = String.format(ConfigReader.getProperty("bs.url"),USERNAME,AUTOMATE_KEY);
    static WebDriver driver;

    public static void createDriver()  {

        switch (ConfigReader.getProperty("browser")) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
