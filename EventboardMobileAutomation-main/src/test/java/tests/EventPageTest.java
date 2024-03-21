package tests;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EventPage;
import pages.LaunchPage;
import pages.MenuPage;
import java.io.IOException;
public class EventPageTest extends BaseTest {
    @Test(priority = 1, testName = "verify Short Event")
    @Description("verify Short Event")
    public void verifyShortEvent() throws Exception {
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        String text = ep.verifyTitleText();
        Assert.assertTrue(text.equals("Book for"));
        Assert.assertEquals(text, "Book for");
        ep.clickShortEventButton();
        Assert.assertEquals(ep.verifyEventReservationScreenConfirmationText(), "Your space is now booked.");
        Assert.assertEquals(ep.verifyEventReservationScreenReservationConfirmationtxt(), "Reservation Confirmation");
        ep.clickOnReservationScreenDoneButton();
        ep.clickOnEventCreated();
        ep.deleteExistingEvent();
        ep.clickOnOK();
    }
    @Test(priority = 2, testName = "verifyMoreOptions")
    @Description("verifyMoreOptions")
    public void verifyMoreOptions() throws IOException, InterruptedException {
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        ep.clickMoreOptionButton();
        Assert.assertTrue(ep.verifyMoreOptionsRoomReservationHeadertxt());
        MenuPage mn = new MenuPage(driver, extentlog);
        mn.clickReserve();
    }
    @Test(priority = 3, testName = "Verify long  event")
    @Description("Verify long event")
    public void verifyEvent() throws InterruptedException {
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        String text = ep.verifyTitleText();
        Assert.assertTrue(text.equals("Book for"));
        ep.clickLongEventButton();
        Assert.assertEquals(ep.verifyEventReservationScreenConfirmationText(), "Your space is now booked.");
        Assert.assertEquals(ep.verifyEventReservationScreenReservationConfirmationtxt(), "Reservation Confirmation");
        ep.clickOnReservationScreenDoneButton();
        ep.clickOnEventCreated();
        ep.deleteExistingEvent();
        ep.clickOnOK();
    }
    @Test(priority = 4, testName = "Delete end event  by creating  short event")
    @Description("Verify end event by creating short event")
    public void verifyEndEvent() throws Exception {
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        ep.clickShortEventButton();
        ep.deleteExistingEvent();
        ep.deleteExistingEventNo();
        ep.deleteExistingEvent();
        ep.clickOnEndMeeting();
    }
    @Test(priority = 5, testName = "Delete end event by creating  long event")
    @Description("Verify end event by creating  long event")
    public void verifyEndEventUsingLong() throws Exception {
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        ep.clickLongEventButton();
        ep.deleteExistingEvent();
        ep.deleteExistingEventNo();
        ep.deleteExistingEvent();
        ep.clickOnEndMeeting();
    }
    @Test(priority = 6, testName = "Verify Busy Room pop-up on +Add Event")
    @Description("Busy room pop-up")
    public void verifyBusyRoomPopupOnAddEvent() throws InterruptedException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickLaunchButton();
        EventPage ep = new EventPage(driver, extentlog);
        ep.clickEvent();
        ep.clickLongEventButton();
        ep.clickOnReservationScreenDoneButton();
        ep.clickEvent();
        String text = ep.verifyBusyRoomPopupOnAddEvent();
        Assert.assertEquals(text, "Busy Room");
        ep.cancelAddEventBusyRoomPopup();
        ep.clickEvent();
        ep.clickOnOK();
    }
}