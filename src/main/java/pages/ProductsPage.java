package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BaseAndroidPageObject;

public class ProductsPage extends BaseAndroidPageObject {

    By filterButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By filterByNameZToAButton = MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
    By listViewButton = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView");
    By addFirstItemToCartButton = MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");

    public ProductsPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    private void clickFilterButton(){
        click(filterButton);
    }

    private void clickNameZToAButton(){
        click(filterByNameZToAButton);
    }

    public void sortProductsByNameZToA() {
        clickFilterButton();
        clickNameZToAButton();
    }

    public void switchToListView(){
        click(listViewButton);
    }

    public void addFirstItemToCart(){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 5);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(addFirstItemToCartButton)));
        click(addFirstItemToCartButton);
    }
}
