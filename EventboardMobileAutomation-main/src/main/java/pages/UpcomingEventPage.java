package pages;
import EventBoardLocatorsEnum_Ios.UpcomingEventPageEnumIos;
import EventBoardLocatorsEnum_android.UpcomingEventPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class UpcomingEventPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public UpcomingEventPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickUpcomingReservedMeeting() {
        Allure.step("clicking on UpcomingReservedMeeting");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_RESERVED_MEETING_PAGE_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageEnumIos.UPCOMING_PAGE_RESERVED_MEETING_PAGE_IOS_XPATH, driver);
        }
    }
    public void clickOnDeleteEvent() {
        Allure.step("clicking on UpcomingReservedMeetingEndYes");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageEnumIos.UPCOMING_PAGE_CANCEL_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickOnUpcomingReservedMeetingEndCancel() {
        Allure.step("clicking on UpcomingReservedMeetingEndYes");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_CANCEL_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageEnumIos.UPCOMING_PAGE_DELETE_EVENT_YES_IOS_XPATH, driver);
        }
    }
    public void clickOnDone() {
        Allure.step("clicking on UpcomingReservedMeetingDone");
        DriverActions.clickOnElement(UpcomingEventPageEnumIos.UPCOMING_PAGE_DELETE_EVENT_DONE_IOS_XPATH, driver);
    }
    public void clickOnUpcomingReservedMeetingEndOk() {
        Allure.step("clicking on UpcomingReservedMeetingEndNoOk");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageEnumIos.UPCOMING_PAGE_DELETE_EVENT_NO_IOS_XPATH, driver);
        }
    }
}