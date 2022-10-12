package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagCartPage extends BaseAndroidPageObject {

    By checkoutButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView");

    public SwagCartPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickCheckoutButton() {
        waitVisibilityOfElementLocated(checkoutButton, 10);
        click(checkoutButton);
    }
}
