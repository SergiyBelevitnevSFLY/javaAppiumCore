import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.SwagLoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstAndroidTest extends BaseAndroidTest{

    @Test
    public void firstAndroidTest(){

        // Start SauceLabsTestApp.apk on android device
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        // Login with standard user. Navigate to all items
        swagLoginPage.login("standard_user", "secret_sauce");

        // Sort them by name from z to a
        swagLoginPage.click(By.xpath("//android.view.ViewGroup[@content-desc='test-Modal Selector Button']" +
                                                  "/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));

        swagLoginPage.click(By.xpath("//android.widget.ScrollView[@content-desc='Selector container']" +
                                                  "/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup" +
                                                  "/android.widget.TextView"));
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Switch to list view
        swagLoginPage.click(By.xpath("//android.view.ViewGroup[@content-desc='test-Toggle']/android.widget.ImageView"));

        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]" +
                "/android.widget.TextView")));

        // Add first item to cart
        swagLoginPage.click(By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]" +
                                                  "/android.widget.TextView"));
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Open cart
        swagLoginPage.click(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']" +
                                                  "/android.view.ViewGroup/android.widget.ImageView"));
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Tap checkout
        swagLoginPage.click(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));

        // Fill the form and tap continue
        swagLoginPage.sendKeys("Yurii", MobileBy.AccessibilityId("test-First Name"));
        swagLoginPage.sendKeys("Baitsar", MobileBy.AccessibilityId("test-Last Name"));
        swagLoginPage.sendKeys("90002", MobileBy.AccessibilityId("test-Zip/Postal Code"));
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        swagLoginPage.click(MobileBy.AccessibilityId("test-CONTINUE"));




    }
}
