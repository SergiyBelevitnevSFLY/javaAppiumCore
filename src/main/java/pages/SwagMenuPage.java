package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagMenuPage extends BaseAndroidPageObject {

    By allItemsButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-ALL ITEMS\"]");
    By closeButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Close\"]/android.widget.ImageView");

    public SwagMenuPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickAllItemsButton() {
        click(allItemsButton);
    }

    public void clickCloseButton() {
        click(closeButton);
    }

}
