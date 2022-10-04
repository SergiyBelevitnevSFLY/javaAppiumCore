package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import pages.base.BaseAndroidPageObject;

public class SwagCartPage extends BaseAndroidPageObject {

    By checkoutButton = MobileBy.AccessibilityId("test-CHECKOUT");
    By yourCart = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView");

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
