package tests;

import driverManagement.BaseTest;
import org.testng.annotations.Test;
import pages.LaunchPage;

public class LaunchPageTest1 extends BaseTest {
    @Test
    public void verifyMenu() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
    }
}