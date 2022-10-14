import org.testng.annotations.Test;
import pages.*;

public class FirstAndroidTest extends BaseAndroidTest {

    @Test
    public void firstAndroidTest() {
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        SwagProductPage swagProductPage = new SwagProductPage(getDriver());
        SwagMenuPage swagMenuPage = new SwagMenuPage(getDriver());
        SwagFilterPage swagFilterPage = new SwagFilterPage(getDriver());
        SwagCartPage swagCartPage = new SwagCartPage(getDriver());
        SwagCheckoutPage swagCheckoutPage = new SwagCheckoutPage(getDriver());

        swagLoginPage.login("standard_user", "secret_sauce");

        swagProductPage.clickMenuButton();

        swagMenuPage.clickAllItemsOption();

        swagMenuPage.clickCloseButton();

        swagProductPage.clickFilterButton();

        swagFilterPage.clickNameZtoA();

        swagProductPage.clickAddToCartFirstElement();

        swagProductPage.clickCartButton();

        swagCartPage.clickCheckoutButton();

        swagCheckoutPage.continueCheckout("Test First Name", "Test Last Name", "11250");

    }
}
