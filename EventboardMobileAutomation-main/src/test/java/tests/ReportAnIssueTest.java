package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.BackButtonPage;
import pages.LaunchPage;
import pages.MenuPage;
import pages.ReportAnIssuePage;
public class ReportAnIssueTest extends BaseTest {
    @Test(priority = 1, testName = "Verify that by adding available amenities user is able to submit the report successfully")
    @Description("User Submit Report an Issue successfully.")
    public void verifyReportAnIssue() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        ReportAnIssuePage rp = new ReportAnIssuePage(driver, extentlog);
        rp.clickReportAnissueButton();
        rp.clickAvBridgeButton();
        rp.enteramenities();
        rp.submitAmenities();
        rp.clickOnOKReportSubmit();
    }
    @Test(priority = 2, testName = "Verify that  user is able to see the amenities of a room")
    @Description("User is able to see the different List of amenities ")
    public void verifySelectAmenitiesReportAnIssue() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        ReportAnIssuePage rp = new ReportAnIssuePage(driver, extentlog);
        rp.clickReportAnissueButton();
    }
    @Test(priority = 3, testName = "Verify that  user is able to select the amenities-AvBridge")
    @Description("User selects amenities for room  .")
    public void verifyViewsReportAnIssue() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        ReportAnIssuePage rp = new ReportAnIssuePage(driver, extentlog);
        rp.clickReportAnissueButton();
        rp.clickAvBridgeButton();
    }
    @Test(priority = 4, testName = "Verify that  user is click on back arrow")
    @Description("User selects back arrow from report an issue")
    public void verifyReportAnIssueBackArrow() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        ReportAnIssuePage rp = new ReportAnIssuePage(driver, extentlog);
        rp.clickReportAnissueButton();
        BackButtonPage backarrow = new BackButtonPage(driver, extentlog);
        backarrow.clickOnBackButton();
        backarrow.clickOnBackButton();
    }
}