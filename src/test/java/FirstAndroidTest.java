import org.testng.annotations.Test;
import pages.SwagLoginPage;

public class FirstAndroidTest extends BaseAndroidTest{

    @Test
    public void firstAndroidTest(){
        SwagLoginPage swagLoginPage = new SwagLoginPage(getDriver());
        swagLoginPage.login("standard_user", "secret_sauce");

    }
}
