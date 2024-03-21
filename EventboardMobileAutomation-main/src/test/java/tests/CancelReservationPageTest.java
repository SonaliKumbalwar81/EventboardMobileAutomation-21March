package tests;
import Utils.CommonUtils;
import driverManagement.BaseTest;
import org.testng.annotations.Test;
import pages.CancelReservationPage;
import pages.LaunchPage;
import pages.MapPage;
import java.io.IOException;
public class CancelReservationPageTest extends BaseTest {
    @Test()
    public void CancelButton() throws IOException, InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
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
}