package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class CartPage extends BaseAndroidPageObject {

    By cartButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]");
    By checkoutButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");

    public CartPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void openCart() {
        click(cartButton);
    }

    public void clickCheckoutButton() {
        click(checkoutButton);
    }
}
