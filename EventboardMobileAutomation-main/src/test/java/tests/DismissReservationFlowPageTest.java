package tests;

import Utils.CommonUtils;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.*;
import java.io.IOException;
public class DismissReservationFlowPageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify MENU > Room Information > Reserve This Room > Cancel.")
    @Description("Verify MENU > Room Information > Reserve This Room > Cancel.")
    public void verifyRoomReservationBookingUsingCurrentDate() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
    @Test(priority = 2, testName = "Verify MENU > Room Information > See on Map > Select Room from the map view > Cancel.")
    @Description("Verify MENU > Room Information > See on Map > Select Room from the map view > Cancel.")
    public void CancelButton1() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        CommonUtils.sleep(6);
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickOnSearchMap();
        crp.EnterRoomName();
        crp.selectRoomFromDropDown();
        crp.clickOnRoomInMap();
        crp.clickCancel();
    }
    @Test(priority = 3, testName = "Verify MENU > Room Information > See on Map > Select Room from the list view > Reserve > Cancel.")
    @Description("Verify MENU > Room Information > See on Map > Select Room from the list view > Reserve > Cancel.")
    public void CancelButton2() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        CommonUtils.sleep(6);
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
    @Test(priority = 4, testName = "Verify MAP > Select Room from the map view > Cancel.")
    @Description("Verify MAP > Select Room from the map view > Cancel.")
    public void CancelRoomReservationUsingSelectRoom() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.clickReservThisRoom();
        mn.verifySelectRoomInMenu();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
    @Test(priority = 5, testName = "Verify MAP > Select room from the List view > Cancel.")
    @Description("Verify MAP > Select room from the List view > Cancel.")
    public void verifyListRESERVEButtonInMap() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnReserveOnList();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
    @Test(priority = 6, testName = "Verify +ADD EVENT > More Options > Cancel.")
    @Description("Verify +ADD EVENT > More Options > Cancel.")
    public void verifyMoreOptions() {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        ep.clickMoreOptionButton();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
    @Test(priority = 7, testName = "Verify MENU > Room Information > See on Map > Select Room from the map view > Go to List >Cancel.")
    @Description("Verify MENU > Room Information > See on Map > Cancel.")
    public void CancelButtonOnMapFlow() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        CommonUtils.sleep(6);
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        CancelReservationPage crp = new CancelReservationPage(driver, extentlog);
        crp.clickCancel();
    }
}