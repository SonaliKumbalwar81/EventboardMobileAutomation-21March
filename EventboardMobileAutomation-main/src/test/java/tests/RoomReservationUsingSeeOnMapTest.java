package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.CancelReservationPage;
import pages.ListPage;
import pages.MenuPage;
import java.io.IOException;
public class RoomReservationUsingSeeOnMapTest extends BaseTest {
    @Test(priority = 1, testName = "Verify Room ReservationBooking usingSeeOnMapTest")
    @Description("Room ReservationBooking UsingSeeOnMap")
    public void RoomReservationUsingSeeOnMapTest1() throws IOException, InterruptedException {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        mn.clickOnDateInRoomReservation();
        mn.clickOnFutureMonthOnDate();
        mn.clickOnFutureDate();
        mn.clickOnOkOnDate();
        mn.clickOnTimeInRoomReservation();
        mn.clickOnOkOnDate();
        mn.clickReserve();
        mn.clickonDone();
    }
    @Test(priority = 2, testName = "Verify Cancel flow on Room ReservationBooking usingSeeOnMapTest")
    @Description("Cancel Flow on Room ReservationBooking UsingSeeOnMap")
    public void RoomReservationUsingSeeOnMapTestCancelFlow() throws IOException, InterruptedException {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        mn.clickOnDateInRoomReservation();
        mn.clickOnFutureMonthOnDate();
        mn.clickOnFutureDate();
        mn.clickOnOkOnDate();
        mn.clickOnTimeInRoomReservation();
        mn.clickOnOkOnDate();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
}