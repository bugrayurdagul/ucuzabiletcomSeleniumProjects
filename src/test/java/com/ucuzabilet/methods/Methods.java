package com.ucuzabilet.methods;

import com.ucuzabilet.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods() {

        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) { return wait.until(ExpectedConditions.presenceOfElementLocated(by));}

    public void click(By by) {findElement(by).click();}

    public void waitBySecond(long seconds)  {

        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void sendKeys(By by, String text){
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void randomPicker(By by){
        List<WebElement> elementList = driver.findElements(by);
        Random random = new Random();
        int randomItemPicked = random.nextInt(elementList.size());
        elementList.get(randomItemPicked).click();

    }






}
