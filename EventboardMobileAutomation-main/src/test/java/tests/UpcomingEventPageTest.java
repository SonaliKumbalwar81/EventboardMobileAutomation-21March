package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.UpcomingEventPage;
public class UpcomingEventPageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify user gets event details")
    @Description("Verify User gets Event Details after selecting current meeting / future meeting")
    public void clickOnUpcomingReservedMeeting() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        UpcomingEventPage upcomingpage = new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
    }
    @Test(priority = 2, testName = "Verify User select Ok from Delete event")
    @Description("Verify User select Ok from Delete event")
    public void clickOnUpcomingReservedMeetingDeleteOk() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        UpcomingEventPage upcomingpage = new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnUpcomingReservedMeetingEndCancel();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnUpcomingReservedMeetingEndOk();
    }
    @Test(priority = 3, testName = "Verify User select Cancel from Delete event")
    @Description("Verify User select Cancel from Delete event")
    public void clickOnUpcomingReservedMeetingDeleteCancel() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        UpcomingEventPage upcomingpage = new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnUpcomingReservedMeetingEndCancel();
    }
    @Test(priority = 4, testName = "Verify cancel Upcoming eventpage cancel the event for multiple  upcoming events successfully")
    @Description("Cancel Delete Upcoming event for multiple events")
    public void clickOnUpcomingReservedMeetingCancel() {
        UpcomingEventPage upcomingpage=new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnUpcomingReservedMeetingEndCancel();
    }
    @Test(priority = 5, testName = "Verify delete Upcoming event for multiple  upcoming events successfully ")
    @Description("Delete Upcoming event for multiple events")
    public void clickOnUpcomingReservedMeetingDelete() {
        UpcomingEventPage upcomingpage=new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnUpcomingReservedMeetingEndOk();
    }
    @Test(priority = 6, testName = "Verify Done cancel the  Upcoming event for multiple  upcoming events successfully ")
    @Description("DONE on  Upcoming event for multiple events")
    public void clickOnUpcomingReservedMeetingDone() {
        UpcomingEventPage upcomingpage=new UpcomingEventPage(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeeting();
        upcomingpage.clickOnDeleteEvent();
        upcomingpage.clickOnDone();
    }
}