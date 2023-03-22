package com.cydeo.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    // static wait in seconds with Thread.sleep()
    public static void wait(int seconds){
        try{
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // wait for visibility of a webElement
    public static void waitForVisibility(WebElement element, int timeout){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // wait for a webElement to be clickable
    public static void waitForClickable(WebElement element, int timeout){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // wait for a webElement until it has a specific text
    public static void waitForText(WebElement element, String text){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendKeysWithWait(WebElement field, String text, int timeout){
        waitForClickable(field,timeout);
        field.sendKeys(text);
    }

    public static void clickWithWait(WebElement element, int timeout){
        waitForVisibility(element, timeout);
        waitForClickable(element, timeout);
        element.click();
    }

    // wait until title contains a specific text
    public static void waitForTitleContains(String title, int timeout){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.titleContains(title));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // wait until url contains a specific text
    public static void waitForUrlContains(String url, int timeout){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






}
