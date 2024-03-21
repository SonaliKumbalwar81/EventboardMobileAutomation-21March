package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuPage;
import pages.UpcomingEventPageTodayTomorrow;
public class UpcomingEventPageTodayTomorowTest extends BaseTest {
    @Test(priority = 1, testName = "Room Reservation Booking  using Todays/Current date")
    @Description("Room ReservationBooking  using current date")
    public void verifyRoomReservationBookingUsingCurrentDateToday1() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.clickReserve();
        mn.clickonDone();
    }
    @Test(priority = 2, testName = "Verify RoomReservation Booking reflect in upcoming  for Tomorrows date")
    @Description("Upcoming Events -Tomorrow")
    public void verifyRoomReservationBookingUsingCurrentDate() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.clickOnDateInRoomReservation();
        mn.clickOnOkOnDate();
        mn.clickReserve();
        Assert.assertTrue(mn.verifySpaceIsBookedMessage());
        mn.clickonDone();
    }
    @Test(priority = 3, testName = "Verify user gets event details for Todays events")
    @Description("Verify User gets Event Details after selecting Todays events")
    public void clickUpcomingReservedMeetingToday() {
        UpcomingEventPageTodayTomorrow upcomingpage = new UpcomingEventPageTodayTomorrow(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeetingToday();
        upcomingpage.clickOnDeleteEventToday();
        upcomingpage.clickOnUpcomingReservedMeetingEndCancelToday();
        upcomingpage.clickOnDeleteEventToday();
        upcomingpage.clickOnUpcomingReservedMeetingEndOkToday();
    }
    @Test(priority = 4, testName = "Verify user gets event details for Tomorrow events")
    @Description("Verify User gets Event Details after selecting Todays events")
    public void clickOnDeleteEventTomorrow() {
        UpcomingEventPageTodayTomorrow upcomingpage = new UpcomingEventPageTodayTomorrow(driver, extentlog);
        upcomingpage.clickUpcomingReservedMeetingTomorrow();
        upcomingpage.clickOnDeleteEventTomorrow();
        upcomingpage.clickOnUpcomingReservedMeetingEndCancelTomorrow();
        upcomingpage.clickOnDeleteEventTomorrow();
        upcomingpage.clickOnUpcomingReservedMeetingEndOkTomorrow();
    }
}
