package utils;

import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static Duration getTimeout(){
        String timeout = ConfigManager.getProperty("timeout");
        int timeoutInSeconds = (timeout != null) ? Integer.parseInt(timeout) : 10 ;

        return Duration.ofSeconds(timeoutInSeconds);
    }

    public static void globalWait()  {

        boolean enableWait = Boolean.parseBoolean((ConfigManager.getProperty("EnableWait")));
        int waitInSeconds = ConfigManager.getIntProperty("waitInSeconds");


        if(enableWait && waitInSeconds > 0 ) {
            try {
                Thread.sleep(waitInSeconds * 100L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Global Wait is interrupted : " + e.getMessage());
            }
        }


    }


    public static WebElement applyWait(WebDriver driver , WebElement element, WaitStrategy waitStrategy){

        WebDriverWait wait = new WebDriverWait( driver, getTimeout());
        switch (waitStrategy) {
            case CLICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(element));

            case VISIBLE:
                return wait.until(ExpectedConditions.visibilityOf(element));
            case NONE:
            default:
                return element;
        }
    }



    public static WebElement applyWait(WebDriver driver , WebElement webElement, By element, WaitStrategy waitStrategy){

        WebDriverWait wait = new WebDriverWait( driver, getTimeout());
        switch (waitStrategy) {
            case CLICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(element));

            case PRESENCE:
                return wait.until(ExpectedConditions.presenceOfElementLocated(element));

            case VISIBLE:
                return wait.until(ExpectedConditions.visibilityOf(webElement));
            case NONE:
            default:
                return webElement;
        }
    }




}
