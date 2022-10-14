package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import pages.base.BaseAndroidPageObject;

public class SwagCartPage extends BaseAndroidPageObject {

    By checkoutButton = MobileBy.AccessibilityId("test-CHECKOUT");
    By yourCart = MobileBy.xpath("//android.widget.TextView[contains(@text, 'YOUR CART')]");

    public SwagCartPage(AndroidDriver appiumDriver) {

        super(appiumDriver);
    }


    public void clickCheckoutButton() {
        waitForElementVisibility(yourCart,5);
        verticalSwipeByPercentages(0.9, 0.2, 0.7);
        waitForElementVisibility(checkoutButton, 5);
        click(checkoutButton);
    }


}
