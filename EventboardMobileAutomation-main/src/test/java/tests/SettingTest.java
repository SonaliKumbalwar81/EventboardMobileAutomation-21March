package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.SettingPage;
public class SettingTest extends BaseTest {
    @Test(priority = 1, testName = "Setting icon is clickable")
    @Description("Setting icon is clickable")
    public void verifySetting() throws Exception {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
    }
    @Test(priority = 2, testName = "User gets options 'Log-out' ")
    @Description("User gets options 'Log-out'")
    public void verifyLogOutAck() throws InterruptedException {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        settingpage.clickOnLogOut();
    }
    @Test(priority = 3, testName = "User gets options 'Acknowledgements'")
    @Description("User gets options ''Acknowledgements' and clicking on back arrow redirects to setting page")
    public void verifyAck() throws InterruptedException {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        settingpage.ClickOnAcknowledgement();
        settingpage.ClickOnBackArrow();
    }
    @Test(priority = 4, testName = "In setting screen user find version number at bottom-right corner")
    @Description("In setting screen user find version number at bottom-right corner")
    public void verifySettingVersion() throws Exception {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        Assert.assertTrue(settingpage.VerifyVersionNumber());
    }
    @Test(priority = 5, testName = "Setting screen shows heading Settings")
    @Description("Setting screen shows heading 'Settings'")
    public void verifySettingHeading() {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        Assert.assertTrue(settingpage.verifySettingText());
    }
    @Test(priority = 6, testName = "Setting screen shows back arrow in heading")
    @Description("Setting screen shows back arrow in heading")
    public void verifyBackArrow() {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        settingpage.ClickOnBackArrow();
    }
    @Test(priority = 7, testName = "Setting back arrow navigate to Launch screen (previous screen)")
    @Description("Setting back arrow navigate to Launch screen (previous screen)")
    public void verifyBacklaunchScreen() {
        SettingPage settingpage = new SettingPage(driver, extentlog);
        settingpage.clickOnSetting();
        settingpage.ClickOnBackArrow();
        settingpage.clickOnTapToStop();
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
    }
}