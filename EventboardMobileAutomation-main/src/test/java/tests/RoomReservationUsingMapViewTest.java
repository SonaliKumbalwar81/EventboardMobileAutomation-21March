package tests;
import driverManagement.BaseTest;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.ListPage;
import pages.MapPage;
import pages.MenuPage;
import java.io.IOException;
public class RoomReservationUsingMapViewTest extends BaseTest {
    @Test()
    public void verifyRoomReservationUsingMapView() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        MapPage mp = new MapPage(driver, extentlog);
        mp.clickMap();
        ListPage list= new ListPage(driver, extentlog);
        list.clickOnList();
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickReserve();
        mn.clickReservThisRoom();
        mn.clickRoomInformation();
        //mn.sendKeysReservedMeeting();
        mn.clickReserve();
    }
}