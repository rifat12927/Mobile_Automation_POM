package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    public AndroidDriver driver;

    @BeforeSuite
    public void startApp() throws MalformedURLException {
        File f = new File("src/test/java/resources");
        File fs = new File(f, "General-Store.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "local1");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("app", fs.getAbsolutePath());
        cap.setCapability("appPackage","com.androidsample.generalstore");
        driver = new AndroidDriver(new URL("http://192.168.0.43:4723/"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterSuite
    public void removeApp() {
        driver.removeApp("com.androidsample.generalstore");
    }
}

