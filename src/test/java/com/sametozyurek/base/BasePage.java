package com.sametozyurek.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver = null;
    WebDriverWait wait = null;
    static Actions actions = null;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait= new WebDriverWait(driver,40);
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void sendKeys(By by, String context){
        findElement(by).sendKeys(context);
    }
}