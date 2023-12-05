package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String homePageActivity="com.androidsample.generalstore.MainActivity";
    public By country= By.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']");
    public By Bangladesh=By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Bangladesh']");
    public By name =By.xpath("//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']");
    public By genderMale= By.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']");
    public By genderFemale=By.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioFemale']");
    public By letsShopButton=By.xpath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']");

}
