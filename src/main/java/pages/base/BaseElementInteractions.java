package pages.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

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

    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = appiumDriver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(appiumDriver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(Duration.ofSeconds(5)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void waitForElementVisibility(By locator, int i) {

        WebDriverWait wait = new WebDriverWait(appiumDriver, (i));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

}
