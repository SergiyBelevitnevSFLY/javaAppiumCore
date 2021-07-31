package pages;

import io.appium.java_client.AppiumDriver;

public class BaseElementInteractions {


    protected AppiumDriver appiumDriver;

    public BaseElementInteractions(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
}
