package pages.base;

import io.appium.java_client.android.AndroidDriver;

public class BaseAndroidPageObject extends AndroidElementInteractions{


    public BaseAndroidPageObject(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }
}
