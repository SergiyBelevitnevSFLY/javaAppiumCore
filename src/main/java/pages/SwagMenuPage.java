package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagMenuPage extends BaseAndroidPageObject {

    By allItemsOption = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView");
    By closeButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Close\"]/android.widget.ImageView");


    public SwagMenuPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickAllItemsOption(){
        click(allItemsOption);
    }

    public void clickCloseButton() { click(closeButton);}




}
