package com.sametozyurek.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static com.sametozyurek.constants.Constants.*;

public class TestBasePage {
    static WebDriver webDriver = null;

    @BeforeScenario
    public void beforeStart(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");

        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(WEBPAGE);

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver){
        TestBasePage.webDriver = webDriver;
    }

    @AfterScenario
    public void exit(){
        getWebDriver().quit();
    }

}