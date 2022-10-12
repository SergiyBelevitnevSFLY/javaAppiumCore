import org.testng.annotations.Test;
import pages.*;

public class FirstAndroidTest extends BaseAndroidTest {

    @Test
    public void firstAndroidTest() {

        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        SwagProductsPage swagProductsPage = new SwagProductsPage(getDriver());
        SwagMenuPage swagMenuPage = new SwagMenuPage(getDriver());
        SwagFilterPage swagFilterPage = new SwagFilterPage(getDriver());
        SwagCartPage swagCartPage = new SwagCartPage(getDriver());
        SwagCheckoutPage swagCheckoutPage = new SwagCheckoutPage(getDriver());

        swagLoginPage.login("standard_user", "secret_sauce");
        swagProductsPage.clickMenuButton();
        swagMenuPage.clickAllItemsButton();
        swagMenuPage.clickCloseButton();
        swagProductsPage.clickFilterButton();
        swagFilterPage.clickNameZtoAButton();
        swagProductsPage.clickAddToCartButton();
        swagProductsPage.clickCartButton();
        swagCartPage.clickCheckoutButton();
        swagCheckoutPage.inputCheckoutInfoAndContinue("Bobby", "McFerrin", "90210");

    }

}