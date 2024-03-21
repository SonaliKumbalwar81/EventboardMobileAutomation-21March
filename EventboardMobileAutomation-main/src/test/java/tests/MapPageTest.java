package tests;
import Utils.CommonUtils;
import Utils.Constants;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import java.io.IOException;
public class MapPageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify  User is able to modify Campus > Building > Floor on map")
    @Description(" Select Campus > Building > Floor. on Map page ")
    public void verifyMap() throws IOException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MapPage map = new MapPage(driver, extentlog);
        map.clickMap();
        map.clickCampusDropdown();
        map.selectCampusDropdown(Constants.getData().getCellData("Data", "Campus", 2));
        map.clickBuildingDropdown();
        map.selectBuildingDropdown(Constants.getData().getCellData("Data", "Building", 2));
        map.clickFloorDropdown();
        map.selectFloorDropdown(Constants.getData().getCellData("Data", "Floor", 2));
        String text = map.verifyTitleText();
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Campus", 2)));
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Building", 2)));
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Floor", 2)));
    }
    @Test(priority = 2, testName = "Verify  User is able to see No Floor Configured  after Campus Selection which doesn't have a floor")
    @Description(" No floor configured  after Campus Selection which doesn't have a floor on Map page ")
    public void verifyMapNoFloorConfig() throws IOException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MapPage map = new MapPage(driver, extentlog);
        map.clickMap();
        map.clickCampusDropdown();
        map.selectCampusDropdown(Constants.getData().getCellData("Data", "Campus", 3));
        map.clickBuildingDropdown();
        map.selectBuildingDropdown(Constants.getData().getCellData("Data", "Building", 3));
        map.clickFloorDropdown();
        map.selectFloorDropdown(Constants.getData().getCellData("Data", "Floor", 3));
        String text = map.verifyTitleText();
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Campus", 3)));
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Building", 3)));
        Assert.assertTrue(text.contains(Constants.getData().getCellData("Data", "Floor", 3)));
    }
    @Test(priority = 3, testName = "Verify user is Clicks  on List in Map")
    @Description("List page will show all the available  list of room in Map")
    public void verifyListButtonInMap() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickReserve();
        CancelReservationPage cancel = new CancelReservationPage(driver, extentlog);
        cancel.clickCancel();
    }
    @Test(priority = 4, testName = "Verify User Clicks Maps Button.")
    @Description("User is able to select room from map")
    public void verifyMapButtonInMap() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        mp.clickOnMapButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickReserve();
        CancelReservationPage cancel = new CancelReservationPage(driver, extentlog);
        cancel.clickCancel();
    }
    @Test(priority = 5, testName = "Verify See On Map Link in Menu Page")
    @Description("User is able to select See On Map Link in menu page")
    public void verifySeeOnMapLinkInMenu() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickMenu();
        mn.clickRoomInformation();
        mn.verifySeeOnMapLink();
        CancelReservationPage cancel = new CancelReservationPage(driver, extentlog);
        cancel.clickOnSearchMap();
        cancel.EnterRoomName();
        cancel.selectRoomFromDropDown();
        cancel.clickOnRoomInMap();
        cancel.clickCancel();
    }
    @Test(priority = 6, testName = "Verify user is Clicks  on List in Map")
    @Description("List page will show all the available  list of room in Map")
    public void verifyListButtonInMapForReserve() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickReserve();
    }
    @Test(priority = 7, testName = "Verify MENU > Room Information > See on Map > Select Room from the map view > Cancel.")
    @Description("Verify MENU > Room Information > See on Map > Select Room from the map view > Cancel.")
    public void RoomReserveMap() throws IOException, InterruptedException {
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
        MenuPage mn1 = new MenuPage(driver, extentlog);
        mn1.clickReserve();
    }
}










