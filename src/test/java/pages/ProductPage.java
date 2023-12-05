package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public By Tittle=By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/toolbar_title']");
    public By Cart= By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']");
    public By Jordan4=By.className("android.widget.LinearLayout");
    public By Joordan4 =By.linkText("ADD TO CART");
}
