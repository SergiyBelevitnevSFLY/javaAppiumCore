package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagCheckoutPage extends BaseAndroidPageObject {

    By firstNameInput = MobileBy.AccessibilityId("test-First Name");
    By lastNameInput = MobileBy.AccessibilityId("test-Last Name");
    By zipInput = MobileBy.AccessibilityId("test-Zip/Postal Code");
    By continueButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView");

    public SwagCheckoutPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void sendFirstNameInput(String firstName) {
        sendKeys(firstName, firstNameInput);
    }

    private void sendLastNameInput(String lastName) {
        sendKeys(lastName, lastNameInput);
    }

    private void sendZipInput(String zip) {
        sendKeys(zip, zipInput);
    }

    private void clickContinueButton() {
        click(continueButton);
    }

    public void inputCheckoutInfoAndContinue(String firstName, String lastName, String zip) {
        sendFirstNameInput(firstName);
        sendLastNameInput(lastName);
        sendZipInput(zip);
        clickContinueButton();
    }

}