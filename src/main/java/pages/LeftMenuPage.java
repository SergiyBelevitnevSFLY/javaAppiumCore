package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class LeftMenuPage extends BaseAndroidPageObject {

    By leftMenuButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]");
    By allItemsButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-ALL ITEMS\"]");
    By closeLeftMenuButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Close\"]");

    public LeftMenuPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void clickLeftMenuButton() {
        click(leftMenuButton);
    }

    private void clickAllItemsButton() {
        click(allItemsButton);
    }

    private void clickCloseLeftMenuButton() {
        click(closeLeftMenuButton);
    }

    public void navigateToAllItems() {
        clickLeftMenuButton();
        clickAllItemsButton();
        clickCloseLeftMenuButton();
    }
}
