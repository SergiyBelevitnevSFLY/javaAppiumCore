import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public abstract class BaseTest {


    protected ThreadLocal<AppiumDriver> appiumDriverThreadLocal = new ThreadLocal<>();


    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        setDriver();
    }

    public abstract void setDriver() throws MalformedURLException;

    public abstract AppiumDriver getDriver();

}
