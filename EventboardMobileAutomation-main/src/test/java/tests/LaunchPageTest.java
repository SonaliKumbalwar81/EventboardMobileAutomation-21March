package tests;
import org.testng.annotations.Test;
import driverManagement.BaseTest;
import pages.LaunchPage;
public class LaunchPageTest extends BaseTest {
    @Test
    public void verifyMenu() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
    }
}