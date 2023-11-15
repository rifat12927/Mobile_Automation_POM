package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.DriverSetup;

public class BasePage extends DriverSetup {
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    public void inputElement(By locator,String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

}
