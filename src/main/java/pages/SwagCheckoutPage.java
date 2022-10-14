package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagCheckoutPage extends BaseAndroidPageObject {

    By userFirstNameInput = MobileBy.AccessibilityId("test-First Name");
    By userLastNameInput = MobileBy.AccessibilityId("test-Last Name");
    By userZipInput = MobileBy.AccessibilityId("test-Zip/Postal Code");
    By continueButton = MobileBy.AccessibilityId("test-CONTINUE");

    public SwagCheckoutPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void sendFirstName(String firstName) {
        sendKeys(firstName, userFirstNameInput);
    }

    private void sendLastName(String lastName) {
        sendKeys(lastName, userLastNameInput);
    }

    private void sendZip(String zip) {
        sendKeys(zip, userZipInput);
    }

    private void clickContinueButton() {
        click(continueButton);
    }

    public void continueCheckout(String firstName, String lastName, String zip) {
        sendFirstName(firstName);
        sendLastName(lastName);
        sendZip(zip);
        clickContinueButton();

    }

}
