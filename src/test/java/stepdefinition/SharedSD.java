package stepdefinition;

import Util.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class SharedSD {

    //Before and after methods==Hook
    private static WebDriver driver = null;
    @Before("@web")
    public static void before(){
        ConfigReader configReader = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", configReader.getChromeDriverPath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(configReader.getUrl());
    }
    @After("@web")
    public static void after(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }
}