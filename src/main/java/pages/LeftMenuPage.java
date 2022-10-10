package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class LeftMenuPage extends BaseAndroidPageObject {

    By leftMenuButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    By allItemsTab = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup");
    By closeLeftMenuButton = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[1]");

    public LeftMenuPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void clickLeftMenuButton(){
        click(leftMenuButton);
    }

    private void clickAllItemsButton(){
        click(allItemsTab);
    }

    private void clickCloseLeftMenuButton(){
        click(closeLeftMenuButton);
    }

    public void navigateToAllItems(){
        clickLeftMenuButton();
        clickAllItemsButton();
        clickCloseLeftMenuButton();
    }
}
