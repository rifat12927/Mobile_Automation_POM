package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverSetup;

import javax.swing.*;
import java.time.Duration;

public class BasePage extends DriverSetup {
    public WebDriverWait wait;


    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);

    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public void inputElement(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }



}
