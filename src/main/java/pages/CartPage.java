package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class CartPage extends BaseAndroidPageObject {

    By cartButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView");
    By checkoutButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']/android.widget.TextView");

    public CartPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void openCart(){
        click(cartButton);
    }

    public void clickCheckoutButton(){
        click(checkoutButton);
    }
}
