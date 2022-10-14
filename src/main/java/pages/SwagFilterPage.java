package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

@SuppressWarnings("rawtypes")
public class SwagFilterPage extends BaseAndroidPageObject {

    By nameZtoA = MobileBy.xpath("//android.widget.TextView[contains(@text, 'Name (Z to A)')]");


    public SwagFilterPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickNameZtoA(){
        click(nameZtoA);
    }






}
