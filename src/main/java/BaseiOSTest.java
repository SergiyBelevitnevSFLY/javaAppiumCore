import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseiOSTest extends BaseTest{

    public IOSDriver<IOSElement> iosDriver;
    @Override
    public void setDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("platformVersion", "14.5");
        capabilities.setCapability("udid", "0AEB1212-2D69-48A0-B8B0-6E703ECE53E6");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("app", "/Users/belevitnev/Desktop/TestApps/SauceLabsTestApp.app");
        iosDriver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        appiumDriverThreadLocal.set(iosDriver);
    }

    @Override
    public IOSDriver<IOSElement> getDriver() {
        return iosDriver;
    }
}
