package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.EndEventPage;
import pages.LaunchPage;
public class EndEventPageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify user dismiss current meeting successfully")
    @Description("Dismiss Current Event")
    public void clickOnDismissEndEvent() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        EndEventPage ep1 = new EndEventPage(driver, extentlog);
        ep1.endCurrentEventDismiss();
    }
    @Test(priority = 2, testName = "Verify user end current meeting successfully")
    @Description("End Current Event")
    public void clickOnEndEvent() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        EndEventPage ep1 = new EndEventPage(driver, extentlog);
        ep1.endCurrentEventEndMeeting();
    }
}