package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

@SuppressWarnings("rawtypes")
public class SwagFilterPage extends BaseAndroidPageObject {

    By nameZtoA = MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");


    public SwagFilterPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickNameZtoA(){
        click(nameZtoA);
    }






}
