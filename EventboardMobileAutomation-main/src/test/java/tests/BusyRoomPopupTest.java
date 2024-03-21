package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BusyRoomPopupPage;
import pages.LaunchPage;
public class BusyRoomPopupTest extends BaseTest {
    @Test(priority = 1, testName = "Verify Busy Room Popup Window")
    @Description("Busy room pop-up")
    public void verifyBusyRoomPopupOnAddEventWindow() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        BusyRoomPopupPage br = new BusyRoomPopupPage(driver, extentlog);
        br.clickEvent();
        br.clickLongEventButton();
        br.clickOnReservationScreenDoneButton();
        br.clickEvent();
        String text = br.verifyBusyRoomPopupOnAddEvent();
        Assert.assertEquals(text, "Busy Room");
    }
    @Test(priority = 2, testName = "Verify Busy Room Popup on Cancel Button")
    @Description("Busy room pop-up")
    public void verifyBusyRoomPopupOnAddEventCancel() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        BusyRoomPopupPage br = new BusyRoomPopupPage(driver, extentlog);
        br.clickEvent();
        String text = br.verifyBusyRoomPopupOnAddEvent();
        Assert.assertEquals(text, "Busy Room");
        br.cancelAddEventBusyRoomPopup();
    }
    @Test(priority = 3, testName = "Verify Busy Room Popup on Ok Button")
    @Description("Busy room pop-up")
    public void verifyBusyRoomPopupOnAddEventOk() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        BusyRoomPopupPage br = new BusyRoomPopupPage(driver, extentlog);
        br.clickEvent();
        br.clickOnOK();
    }
}