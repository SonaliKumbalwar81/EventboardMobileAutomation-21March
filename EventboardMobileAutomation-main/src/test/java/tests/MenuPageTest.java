package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.MenuPage;
public class MenuPageTest extends BaseTest {
    @Test(priority = 1, testName = "verifyRoomReservationBookingUsingCurrentDate")
    @Description("Verify User gets Event Details after selecting current meeting / future meeting")
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
    @Test(priority = 2, testName = "Verify Event Title on Room Reservation")
    @Description("Event Title")
    public void verifyEventTitle() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.sendKeysReservedMeeting();
        mn.clickReserve();
        mn.clickonDone();
        Assert.assertTrue(mn.verifyEventTitle());
    }
    @Test(priority = 3, testName = "verifySchedulingConflictPopUp")
    @Description("verifySchedulingConflictPopUp")
    public void verifySchedulingConflictPopUp() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.clickOnDateInRoomReservation();
        mn.clickOnOkOnDate();
        mn.clickReserve();
        Assert.assertTrue(mn.verifySchedulingConflictMessage());
    }
}