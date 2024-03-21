package pages;
import EventBoardLocatorsEnum_Ios.UpcomingEventPageTodayTomorrowEnumIos;
import EventBoardLocatorsEnum_android.UpcomingEventPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class UpcomingEventPageTodayTomorrow {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public UpcomingEventPageTodayTomorrow(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickUpcomingReservedMeetingToday() {
        Allure.step("clicking on UpcomingReservedMeeting for Today");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_RESERVED_MEETING_PAGE_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_RESERVED_MEETING_PAGE_TODAY_IOS_XPATH, driver);
        }
    }
    public void clickUpcomingReservedMeetingTomorrow() {
        Allure.step("clicking on UpcomingReservedMeeting for Tomorrow");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_RESERVED_MEETING_PAGE_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_RESERVED_MEETING_PAGE_TOMORROW_IOS_XPATH, driver);
        }
    }
    public void clickOnDeleteEventToday() {
        Allure.step("clicking on delete events for Today");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_DELETE_EVENT_IOS_TODAY_XPATH, driver);
        }
    }
    public void clickOnDeleteEventTomorrow() {
        Allure.step("clicking on delete events for Tomorrow");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_CANCEL_EVENT_IOS_TOM_XPATH, driver);
        }
    }
    public void clickOnUpcomingReservedMeetingEndCancelToday() {
        Allure.step("clicking on Cancel for Today upcoming events");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_CANCEL_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_DELETE_EVENT_NO_IOS_TODAY_XPATH, driver);
        }
    }
    public void clickOnUpcomingReservedMeetingEndCancelTomorrow() {
        Allure.step("clicking on Cancel for Tomorrow upcoming events");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_CANCEL_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_DELETE_EVENT_NO_IOS_TOM_XPATH ,driver);

        }
    }
    public void clickOnUpcomingReservedMeetingEndOkToday() {
        Allure.step("clicking on Ok for Tomorrow upcoming events");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_DELETE_EVENT_YES_IOS_TODAY_XPATH, driver);
        }
    }
    public void clickOnUpcomingReservedMeetingEndOkTomorrow() {
        Allure.step("clicking on Ok for Tomorrow upcoming events");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(UpcomingEventPageEnum.UPCOMING_PAGE_DELETE_EVENT_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(UpcomingEventPageTodayTomorrowEnumIos.UPCOMING_PAGE_DELETE_EVENT_YES_IOS_TOM_XPATH, driver);
        }
    }
}
