import org.testng.annotations.Test;
import pages.*;

public class FirstAndroidTest extends BaseAndroidTest {

    @Test
    public void firstAndroidTest() {
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        swagLoginPage.login("standard_user", "secret_sauce");

        SwagProductPage swagProductPage = new SwagProductPage(getDriver());
        swagProductPage.clickMenuButton();

        SwagMenuPage swagMenuPage = new SwagMenuPage(getDriver());
        swagMenuPage.clickAllItemsOption();
        swagMenuPage.clickCloseButton();

        swagProductPage.clickFilterButton();

        SwagFilterPage swagFilterPage = new SwagFilterPage(getDriver());
        swagFilterPage.clickNameZtoA();

        swagProductPage.clickAddToCartFirstElement();

        swagProductPage.clickCartButton();

        SwagCartPage swagCartPage = new SwagCartPage(getDriver());

        swagCartPage.clickCheckoutButton();

    }
}
