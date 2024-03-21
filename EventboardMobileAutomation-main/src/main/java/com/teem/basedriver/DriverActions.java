package com.teem.basedriver;
import Common.CustomExceptions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;

public class DriverActions {
    static int dynamicTimeout = 60;
    private static WebElement getWebElement(Enum<?> enumDescription, AppiumDriver driver) {
        String enumKey = enumDescription.name();
        String suffixLocatorType = enumKey.substring(enumKey.lastIndexOf("_") + 1);
        switch (suffixLocatorType) {
            case "XPATH":
                return driver.findElement(By.xpath(enumDescription.toString()));
            case "ID":
                return driver.findElement(By.id(enumDescription.toString()));
            default:
                throw new CustomExceptions("Locator " + enumDescription.name() + " is declared incorrectly at " + enumDescription.getDeclaringClass());
        }
    }
    public static Boolean isDisplayed(Enum<?> enumDescription, AppiumDriver driver) {
        WebElement webElement = getWebElement(enumDescription, driver);
        waitForElementToBeVisible(webElement, driver, dynamicTimeout);
        return webElement.isDisplayed();
    }
    /**
     * This method clicks on the element for which the locator is passed.
     *
     * @param enumDescription
     */
    public static void clickOnElement(Enum<?> enumDescription, AppiumDriver driver) {
        WebElement webElement = getWebElement(enumDescription, driver);
        waitForElementToBeVisible(webElement, driver, dynamicTimeout);
        if (webElement != null) webElement.click();
    }
    public static void waitForElementToBeVisible(WebElement element, AppiumDriver driver, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).withMessage(() -> "Waiting for element to be visible.").pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOf(element));
        System.out.println(element + "is now visible.");
    }
    public static String getText(Enum<?> enumDescription, AppiumDriver driver) {
        WebElement webElement = getWebElement(enumDescription, driver);
        waitForElementToBeVisible(webElement, driver, dynamicTimeout);
        return webElement.getText();
    }
    public static void sendKeysToElement(Enum<?> enumDescription, String message, AppiumDriver driver) {
        WebElement webElement = getWebElement(enumDescription, driver);
        waitForElementToBeVisible(webElement, driver, dynamicTimeout);
        webElement.sendKeys(message);
    }
    public static void action_clickOnPosition(int pointA_X, int pointA_Y, AppiumDriver driver) throws MalformedURLException {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1);
        clickPosition.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), pointA_X, pointA_Y)).addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(clickPosition));
    }
}
