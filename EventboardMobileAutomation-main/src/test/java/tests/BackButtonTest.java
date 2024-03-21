package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.BackButtonPage;
import pages.LaunchPage;
import pages.MenuPage;

public class BackButtonTest extends BaseTest {
    @Test(priority = 1, testName = "Verify User is able to click on back button ")
    @Description("click  on back button ")
    public void verifybackButtonOnMenuPage() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        BackButtonPage bckbtn = new BackButtonPage(driver, extentlog);
        bckbtn.clickOnBackButton();
    }
    @Test(priority = 2, testName = "User is able to see the previous screen of Menu page ")
    @Description("The user should be able to click on the back button and it should redirect to Main screen.")
    public void verifyAck() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        BackButtonPage bckbtn = new BackButtonPage(driver, extentlog);
        bckbtn.clickOnBackButton();
        mn.clickMenu();
    }
}