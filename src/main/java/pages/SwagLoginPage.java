package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagLoginPage extends BaseAndroidPageObject {

    By userNameInput = MobileBy.AccessibilityId("test-Username");
    By passwordInput = MobileBy.AccessibilityId("test-Password");
    By loginButton = MobileBy.AccessibilityId("test-LOGIN");

    public SwagLoginPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void sendUserName(String userName) {
        sendKeys(userName, userNameInput);
    }

    private void sendPassword(String password) {
        sendKeys(password, passwordInput);
    }

    private void clickLoginButton() {
        click(loginButton);
    }

    public void login(String userName, String password) {
        sendUserName(userName);
        sendPassword(password);
        clickLoginButton();
    }


}
