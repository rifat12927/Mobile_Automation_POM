package testcases;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

import java.sql.Time;

public class RunApp extends DriverSetup {

    HomePage homePage = new HomePage();

    @Test
    public void runApp() throws InterruptedException {
//
        homePage.clickOnElement(homePage.country);
        homePage.getElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Bangladesh\"));"));
        homePage.clickOnElement(homePage.Bangladesh);
//
        homePage.inputElement(homePage.name, "Rifat");
        homePage.clickOnElement(homePage.genderMale);
        homePage.clickOnElement(homePage.letsShopButton);
        Thread.sleep(5000);



    }
}
