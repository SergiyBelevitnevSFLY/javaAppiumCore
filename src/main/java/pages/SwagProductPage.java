package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.base.BaseAndroidPageObject;

public class SwagProductPage extends BaseAndroidPageObject {

    By menuButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    By filterButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By addToCartFirstElement = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");
    By cartButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");


    public SwagProductPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickMenuButton(){
        click(menuButton);
    }
    public void clickFilterButton(){
        click(filterButton);
    }
    public void clickAddToCartFirstElement(){
        click(addToCartFirstElement);
    }
    public void clickCartButton(){
        click(cartButton);
    }






}
