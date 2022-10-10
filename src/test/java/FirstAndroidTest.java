import org.testng.annotations.Test;
import pages.LeftMenuPage;
import pages.SwagLoginPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductsPage;

public class FirstAndroidTest extends BaseAndroidTest{

    @Test
    public void firstAndroidTest(){
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        swagLoginPage.login("standard_user", "secret_sauce");

        LeftMenuPage leftMenu = new LeftMenuPage(getDriver());
        leftMenu.navigateToAllItems();

        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.sortProductsByNameZToA();
        productsPage.switchToListView();
        productsPage.addFirstItemToCart();

        CartPage cart = new CartPage(getDriver());
        cart.openCart();
        cart.clickCheckoutButton();

        CheckoutPage checkout = new CheckoutPage(getDriver());
        checkout.fillCheckoutInformation("John", "Smith", "10003");
    }
}
