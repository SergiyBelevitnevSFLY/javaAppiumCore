import org.testng.annotations.Test;
import pages.BaseAndroidPageObject;

public class FirstAndroidTest extends BaseAndroidTest{

    @Test
    public void firstAndroidTest(){
        BaseAndroidPageObject baseAndroidPageObject = new BaseAndroidPageObject(getDriver());

    }
}
