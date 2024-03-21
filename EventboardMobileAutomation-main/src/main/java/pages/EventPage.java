package pages;
import EventBoardLocatorsEnum_Ios.EventPageEnumIos;
import EventBoardLocatorsEnum_android.EventPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class EventPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public EventPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickEvent() {
        Allure.step("clicking on Event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_EVENT_IOS_XPATH, driver);
        }
    }
    public String verifyTitleText() throws InterruptedException {
        return DriverActions.getText(EventPageEnum.EVENT_PAGE_TITLE_TEXT_XPATH, driver);
    }
    public String verifyBusyRoomPopupOnAddEvent() {
        Allure.step("Verify Busy Room Pop up");
        return DriverActions.getText(EventPageEnum.EVENT_PAGE_BUSY_ROOM_POP_UP_XPATH,driver);
    }
    public void clickShortEventButton() {
        Allure.step("Verify short event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_SHORT_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_SHORT_EVENT_XPATH_IOS_XPATH, driver);
        }
    }
    public void clickLongEventButton() {
        Allure.step("Verify long event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_LONG_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_LONG_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickMoreOptionButton() {
        Allure.step("Click on More Option");
        DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_MORE_OPTION_XPATH, driver);
    }
    public String verifyEventReservationScreenConfirmationText() throws InterruptedException {
        return DriverActions.getText(EventPageEnum.EVENT_PAGE_RESERVATION_CONFIRMATION_TEXT_XPATH, driver);
    }
    public void clickOnReservationScreenDoneButton() {
        DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_RESERVATION_CONFIRMATION_SCREEN_DONE_BTN_XPATH, driver);
    }
    public String verifyEventReservationScreenReservationConfirmationtxt() {
        return DriverActions.getText(EventPageEnum.EVENT_PAGE_RESERVATION_CONFIRMATION_TEXT_XPATH, driver);
    }
    public Boolean verifyMoreOptionsRoomReservationHeadertxt() throws InterruptedException {
        return DriverActions.isDisplayed(EventPageEnum.EVENT_PAGE_ROOM_RESERVATION_HEADER_XPATH, driver);
    }
    public void clickOnEventCreated() {
        DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_XPATH, driver);
    }
    public void deleteExistingEvent() {
        Allure.step("Delete existing event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_IOS_XPATH, driver);
        }
    }
    public void deleteExistingEventNo() {
        Allure.step("Cancel  existing  end event ");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_END_EVENT_NO_PAGE_IF_EXISTS_BUTTON_IOS_XPATH, driver);
        }
    }
    public void cancelAddEventBusyRoomPopup() {
        Allure.step("clicking on Cancel");
        DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_CANCEL_BUTTON_XPATH,driver);
    }
    public void clickOnEndMeeting() {
        Allure.step("Cancel  existing  end event ");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_END_MEETING_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickOnOK() {
        Allure.step("Clicking on Busy Room - Ok");
        DriverActions.clickOnElement(EventPageEnum.EVENT_PAGE_OK_BUTTON_XPATH, driver);
    }
}