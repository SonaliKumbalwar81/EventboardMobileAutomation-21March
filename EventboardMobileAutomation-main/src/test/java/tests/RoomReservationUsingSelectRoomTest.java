package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.ListPage;
import pages.MenuPage;
public class RoomReservationUsingSelectRoomTest extends BaseTest {
    @Test(priority = 1, testName = "Verify Room ReservationBooking usingSelectRoomTest")
    @Description("Room ReservationBooking UsingSelect Room")
    public void RoomReservationUsingSelectRoomTest() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.verifySelectRoomInMenu();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        mn.clickOnDateInSelectRoomRoomReservation();
        mn.clickOnDateInSelectRoomFutureMonthFirstRoomReservation();
        mn.clickOnDateInSelectRoomFutureMonthRoomReservation();
        mn.clickOnDateInSelectRoomFutureMonthFirstRoomReservation();
        mn.clickonDoneInDate();
        mn.clickReserveOnSelectRoom();
    }
    @Test(priority = 2, testName = "Verify  cancel flow for Room ReservationBooking usingSelectRoomTest")
    @Description("Cancel flow for Room ReservationBooking UsingSelect Room")
    public void CancelRoomReservationUsingSelectRoomTest() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.verifySelectRoomInMenu();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        mn.clickOnCanceOnSelectRoom();
    }
}