package pages;
import EventBoardLocatorsEnum_Ios.MenuPageEnumIos;
import EventBoardLocatorsEnum_android.MenuPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class MenuPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public MenuPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickMenu() {
        Allure.step("clicking on Menu button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_MENU_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_MENU_IOS_XPATH, driver);
        }
    }
    public void clickRoomInformation() {
        Allure.step("clicking on RoomInformation button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_ROOM_INFORMATION_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_ROOM_INFORMATION_IOS_XPATH, driver);
        }
    }
    public void clickReservThisRoom() {
        Allure.step("clicking on ReservThisRoom button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_RESERVE_THIS_ROOM_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_RESERVE_THIS_ROOM__IOS_XPATH, driver);
        }
    }
    public void clickOnDateInRoomReservation() {
        Allure.step("clicking on date in room Reservation button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DATE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_IOS_XPATH, driver);
        }
    }
    public void clickOnDateInSelectRoomRoomReservation() {
        Allure.step("clicking on date in room Reservation button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_RESERVE_THIS_ROOM_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_SELECT_ROOM_IOS_XPATH, driver);
        }
    }
    public void clickOnDateInSelectRoomFutureMonthRoomReservation() {
        Allure.step("clicking on date in room Reservation button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DATE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_SELECT_ROOM_FUTURE_MONTH_IOS_XPATH, driver);
        }
    }
    public void clickOnDateInSelectRoomFutureMonthFirstRoomReservation() {
        Allure.step("clicking on date in room Reservation button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DATE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_SELECT_ROOM_FUTURE_MONTH_FIRST_IOS_XPATH, driver);
        }
    }
    public void clickOnOkOnDate() {
        Allure.step("clicking on Ok button");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_TIME_DONE_IOS_XPATH, driver);
        }
    }
    public void clickOnFutureMonthOnDate() {
        Allure.step("clicking  OnFutureMonthOnDate");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_FUTURE_MONTH_IOS_XPATH, driver);
        }
    }
    public void clickOnFutureDate() {
        Allure.step("clicking on FutureDate button");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_OK_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE__FUTURE_MONTH_DATE_IOS_XPATH, driver);
        }
    }
    public void sendKeysReservedMeeting() {
        Allure.step("Verifying event title ");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.sendKeysToElement(MenuPageEnum.MENU_PAGE_RESERVED_MEETING_XPATH, "Test Event Title",driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_RESERVE_THIS_ROOM__IOS_XPATH, driver);
        }
    }
    public Boolean verifyEventTitle() {
        Allure.step("Verify Event Title");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            return DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_EVENT_TITLE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_DATE_IOS_XPATH, driver);
        }
        return null;
    }
    public void clickOnTimeInRoomReservation() {
        Allure.step("clicking on TimeInRoomReservation");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DATE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_TIME_ON_ROOM_RESERVATION_IOS_XPATH, driver);
        }
    }
    public void clickReserve() {
        Allure.step("clicking on Reserve button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_RESERVE_IOS_XPATH, driver);
        }
    }
    public void clickReserveOnSelectRoom() {
        Allure.step("clicking on Reserve button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_SELECT_ROOM_RESERVE_IOS_XPATH, driver);
        }
    }
    public void verifySeeOnMapLink() {
        Allure.step("clicking on SeeOnmap Link");
        //DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_SEE_ON_MAP_ID, driver);
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_SEE_ON_MAP_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_SEE_ON_MAP_IOS_XPATH, driver);
        }
    }
    public void verifySelectRoomInMenu() {
        Allure.step("clicking on Select Room Link");
        //DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_SEE_ON_MAP_ID, driver);
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_SEE_ON_MAP_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_SELECT_ROOM_IN_MENU_IOS_XPATH, driver);
        }
    }
    public void clickonDone() {
        Allure.step("clicking on Done button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DONE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_RESERVATION_CONFIRMATION_DONE_ON_IOS_XPATH, driver);
        }
    }
    public void clickonDoneInDate() {
        Allure.step("clicking on Done button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_DONE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_TIME_DONE_IOS_XPATH, driver);
        }
    }
    public void clickOnCanceOnSelectRoom() {
        Allure.step("clicking on cancel button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_CANCEL_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MenuPageEnumIos.MENU_PAGE_RESERVATION_PAGE_CANCEL_SELECT_ROOM_IOS_XPATH, driver);
        }
    }
    public Boolean verifySpaceIsBookedMessage() {
        Allure.step("verifySpaceIsBookedMessage");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            return DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_SPACE_IS_BOOKED_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            return DriverActions.isDisplayed(MenuPageEnumIos.MENU_PAGE_SPACE_IS_BOOKED_IOS_XPATH, driver);
        }
        return null;
    }
    public Boolean verifySchedulingConflictMessage() {
        Allure.step("verify SchedulingConflictMessage ");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            return DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_SCHEDULING_CONFLICT_POPUP_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            return DriverActions.isDisplayed(MenuPageEnumIos.MENU_PAGE_SCHEDULING_CONFLICT_POPUP_IOS_XPATH, driver);
        }
        return null;
    }
}