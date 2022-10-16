package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class CheckoutPage extends BaseAndroidPageObject {

    By firstNameInput = MobileBy.AccessibilityId("test-First Name");
    By lastNameInput = MobileBy.AccessibilityId("test-Last Name");
    By zipPostalCodeInput = MobileBy.AccessibilityId("test-Zip/Postal Code");
    By continueButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]");

    public CheckoutPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void sendFirstName(String firstName) {
        sendKeys(firstName, firstNameInput);
    }

    private void sendLastName(String lastName) {
        sendKeys(lastName, lastNameInput);
    }

    private void sendZipPostalCode(String zipPostalCode) {
        sendKeys(zipPostalCode, zipPostalCodeInput);
    }

    private void clickContinueButton() {
        click(continueButton);
    }

    public void fillCheckoutInformation(String firstName, String lastName, String zipPostalCode) {
        sendFirstName(firstName);
        sendLastName(lastName);
        sendZipPostalCode(zipPostalCode);
        clickContinueButton();
    }

}
