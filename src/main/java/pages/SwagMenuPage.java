package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagMenuPage extends BaseAndroidPageObject {

    By allItemsOption = MobileBy.AccessibilityId("test-ALL ITEMS");
    By closeButton = MobileBy.AccessibilityId("test-Close");


    public SwagMenuPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickAllItemsOption(){
        click(allItemsOption);
    }

    public void clickCloseButton() { click(closeButton);}




}
