import org.testng.annotations.Test;
import pages.base.BaseIOSPageObject;

public class FirstiOSTest extends BaseiOSTest{

    @Test
    public void firstTest(){

        BaseIOSPageObject baseIOSPageObject = new BaseIOSPageObject(getDriver());
        System.out.println("test id " +Thread.currentThread().getId());

    }
}
