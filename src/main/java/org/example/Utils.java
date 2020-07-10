package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //to click on element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }

    //to enter text
    public static void enterText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public static void clearText(By by){
        driver.findElement(by).clear();
    }

    //to get text from element
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    //to select from drop list by visible text
    public static void selectByVisibleText(By by, String name){
        new Select(driver.findElement(by)).selectByVisibleText(name);
    }

    //select random date
    public  String timeStamp (){
        DateFormat format = new SimpleDateFormat("ddMMMyyHHmmss");
        return format.format(new Date());
    }

    //to wait for element to be invisible
    public static void waitForElementToBeInvisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));

    }
    public static void waitForElementToBeVisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //to wait for element to be display
    public static void waitForElementToBeDisplay(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));

    }
    //to select from dropList by index
    public static void selectByIndex(By by, int numb) {
        new Select(driver.findElement(by)).selectByIndex(numb);

    }



}
