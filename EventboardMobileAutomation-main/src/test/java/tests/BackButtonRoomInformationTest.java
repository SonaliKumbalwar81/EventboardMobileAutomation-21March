package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.BackButtonRoomInformationPage;
import pages.LaunchPage;
import pages.MenuPage;
public class BackButtonRoomInformationTest extends BaseTest {
    @Test(priority = 1, testName = "Verify User is able to click on back button ")
    @Description("click  on back button ")
    public void verifybackButtonOnRoomInformationPage() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        BackButtonRoomInformationPage bckbtn = new BackButtonRoomInformationPage(driver, extentlog);
        bckbtn.clickOnBackButtonRoomInformation();
    }
    @Test(priority = 2, testName = "User is able to see the previous screen of Menu page ")
    @Description("The user should be able to click on the back button and it should redirect to Main screen.")
    public void verifyMenuOnBack() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        BackButtonRoomInformationPage bckbtn = new BackButtonRoomInformationPage(driver, extentlog);
        bckbtn.clickOnBackButtonRoomInformation();
        mn.clickMenu();
    }
        }