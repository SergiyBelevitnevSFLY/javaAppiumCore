package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagProductsPage extends BaseAndroidPageObject {


    By menuButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    By filterButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By addToCartButton = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");
    By cartButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");


    public SwagProductsPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickMenuButton() {
        click(menuButton);
    }

    public void clickFilterButton() {
        click(filterButton);
    }

    public void clickAddToCartButton() {
        waitVisibilityOfElementLocated(addToCartButton, 5);
        click(addToCartButton);
    }

    public void clickCartButton() {
        click(cartButton);
    }
}
