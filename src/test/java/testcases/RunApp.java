package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

import java.sql.Time;

public class RunApp extends DriverSetup {

    HomePage homePage = new HomePage();

    @Test
    public void runApp() throws InterruptedException {
//        driver.findElement(homePage.country);
        homePage.getElement(homePage.country);
        homePage.selectWithText("Bangladesh");
        homePage.inputElement(homePage.name, "Rifat");
        homePage.clickOnElement(homePage.genderMale);
        homePage.clickOnElement(homePage.letsShopButton);


    }
}
