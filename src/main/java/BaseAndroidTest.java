import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseAndroidTest extends BaseTest {


    public AndroidDriver<AndroidElement> androidDriver;

    @Override
    public void setDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", System.getProperty("user.dir") + "/SauceLabsTestApp.apk");
        desiredCapabilities.setCapability("platformVersion", "10");
        desiredCapabilities.setCapability("deviceName", "Pixel XL API 29");
        desiredCapabilities.setCapability("appActivity", ".SplashActivity");
        desiredCapabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        appiumDriverThreadLocal.set(androidDriver);
    }

    @Override
    public AndroidDriver<AndroidElement> getDriver() {
        return androidDriver;
    }
}
