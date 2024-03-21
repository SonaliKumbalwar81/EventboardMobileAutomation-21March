package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.ListPage;
import pages.MenuPage;
public class RoomReservationFlowUsingSelectRoomTest extends BaseTest {
    @Test(testName = "Verify  Room ReservationBooking usingSelectRoomTest")
    @Description("Room ReservationBooking UsingSelect Roomo")
    public void RoomReservationFlowUsingSelectRoomTest() {
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.verifySelectRoomInMenu();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        mn.clickReserve();
    }
}