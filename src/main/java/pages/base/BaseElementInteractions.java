package pages.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseElementInteractions {


    protected AppiumDriver<MobileElement> appiumDriver;

    public BaseElementInteractions(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public MobileElement mobileElement(By locator){
        return appiumDriver.findElement(locator);
    }

    public void sendKeys(String inputString, By locator){
        mobileElement(locator).sendKeys(inputString);
    }

    public void click(By locator){
        mobileElement(locator).click();
    }

    public void waitVisibilityOfElementLocated(By locator, int i){
        WebDriverWait driverWait = new WebDriverWait(appiumDriver, (i));
        driverWait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(locator)));
    }
}
