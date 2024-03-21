package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ListPage;
import pages.MapPage;
import pages.MenuPage;
public class ListPageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify Room-reservation using List flow")
    @Description("Room-reservation using List flow")
    public void verifyListButtonInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickOnDateInRoomReservation();
        mn.clickOnFutureMonthOnDate();
        mn.clickOnFutureDate();
        mn.clickOnOkOnDate();
        mn.clickOnTimeInRoomReservation();
        mn.clickOnOkOnDate();
        mn.clickReserve();
        mn.clickonDone();
    }
    @Test(priority = 2, testName = "Verify List icon is visible at right top corner in header")
    @Description("List icon is visible at right top corner in header")
    public void verifyListIconInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
    }
    @Test(priority = 3, testName = "Verify List screen shows heading Spaces available for with day and date")
    @Description("List screen shows heading Spaces available for with day and date.")
    public void verifyListHeadingSpacesDayDateInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        Assert.assertTrue(list.verifydayDateOnReserveOnList());
        list.clickOnReserveOnList();
    }
    @Test(priority = 4, testName = "Verify List screen shows heading time")
    @Description("List screen shows heading time.")
    public void verifyListTimeInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
        Assert.assertTrue(list.verifyTimeOnReserveOnList());
    }
    @Test(priority = 5, testName = "Verify List shows available Spaces For.")
    @Description("List shows available Spaces For.")
    public void verifyListAvailableRoomInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        Assert.assertTrue(list.verifySpacesAvailableOnReserveOnList());
    }
    @Test(priority = 6, testName = "Verify List shows Reserve button")
    @Description("List shows Reserve button.")
    public void verifyListRESERVEButtonInMap() throws InterruptedException {
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list = new ListPage(driver, extentlog);
        list.clickOnList();
        list.clickOnReserveOnList();
    }
}