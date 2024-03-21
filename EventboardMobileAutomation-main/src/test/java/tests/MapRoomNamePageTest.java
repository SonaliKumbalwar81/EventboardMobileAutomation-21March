package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.MapPage;
import pages.MapRoomNamePage;
import java.io.IOException;
public class MapRoomNamePageTest extends BaseTest {
    @Test(priority = 1, testName = "Verify  User is able to modify Campus > Building > Floor on map")
    @Description(" Select Campus > Building > Floor. on Map page ")
    public void verifyMap() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MapPage map = new MapPage(driver, extentlog);
        map.clickMap();
        MapRoomNamePage mrnp = new MapRoomNamePage(driver, extentlog);
        mrnp.clickOnSearchMap();
        mrnp.EnterRoomName();
        mrnp.selectRoomFromDropDown();
        mrnp.clickOnRoomInMap();
        Assert.assertTrue(mrnp.verifyMapRoomNamePage());
    }
}