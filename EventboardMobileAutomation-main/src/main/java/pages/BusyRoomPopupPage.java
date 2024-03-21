package pages;

import EventBoardLocatorsEnum_Ios.EventPageEnumIos;
import EventBoardLocatorsEnum_android.BusyRoomPopupPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class BusyRoomPopupPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public BusyRoomPopupPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public String verifyBusyRoomPopupOnAddEvent() {
        Allure.step("Verify Busy Room Pop up");
        return DriverActions.getText(BusyRoomPopupPageEnum.EVENT_PAGE_BUSY_ROOM_POP_UP_XPATH, driver);
    }
    public void clickEvent() {
        Allure.step("clicking on Event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BusyRoomPopupPageEnum.EVENT_PAGE_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickLongEventButton() {
        Allure.step("Verify long event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BusyRoomPopupPageEnum.EVENT_PAGE_LONG_EVENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_LONG_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickOnReservationScreenDoneButton() {
        Allure.step("Click On Done Button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BusyRoomPopupPageEnum.EVENT_PAGE_RESERVATION_CONFIRMATION_SCREEN_DONE_BTN_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_LONG_EVENT_IOS_XPATH, driver);
        }
    }
    public void cancelAddEventBusyRoomPopup() {
        Allure.step("Click On Cancel Button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BusyRoomPopupPageEnum.EVENT_PAGE_CANCEL_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_LONG_EVENT_IOS_XPATH, driver);
        }
    }
    public void clickOnOK() {
        Allure.step("Click On Ok Button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BusyRoomPopupPageEnum.EVENT_PAGE_OK_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_LONG_EVENT_IOS_XPATH, driver);
        }
    }
}