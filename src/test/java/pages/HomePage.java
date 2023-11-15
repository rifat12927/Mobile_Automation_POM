package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String homePageActivity="com.androidsample.generalstore.MainActivity";
    public By country= By.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");


}
