package pages;
import EventBoardLocatorsEnum_Ios.CancelReservationPageEnumIos;
import EventBoardLocatorsEnum_Ios.MapPageEnumIos;
import EventBoardLocatorsEnum_android.CancelPageEnum;
import EventBoardLocatorsEnum_android.MapPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;
public class CancelReservationPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public CancelReservationPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickOnMap() {
        Allure.step("Click on Map");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_MAP_MAIN_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageEnumIos.MAP_MAP_MAIN_IOS_FOR_CANCEL_XPATH, driver);
        }
    }
    public void EnterRoomName() throws InterruptedException {
        Allure.step("clicking on Enter Room name");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.sendKeysToElement(CancelPageEnum.CANCEL_RESERVATION_PAGE_ENTER_ROOM_NAME_ID, "QA Test Room", driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.sendKeysToElement(CancelReservationPageEnumIos.CANCEL_RESERVATION_PAGE_ENTER_ROOM_NAME_IOS_XPATH, "Room 2 test ks", driver);
        }
    }
    public void clickCancel() {

        Allure.step("clicking on cancel");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(CancelPageEnum.CANCEL_RESERVATION_PAGE_CANCEL_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(CancelReservationPageEnumIos.CANCEL_RESERVATION_PAGE_CANCEL_IOS_XPATH, driver);
        }
    }
    public void clickOnSearchMap() {
        Allure.step("clicking on Search Map");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(CancelPageEnum.CANCEL_RESERVATION_PAGE_SEARCH_MAP_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(CancelReservationPageEnumIos.CANCEL_RESERVATION_PAGE_SEARCH_MAP_IOS_XPATH, driver);
        }
    }
    public void selectRoomFromDropDown() throws InterruptedException {
        Allure.step("Select Room from dropdown");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(CancelPageEnum.CANCEL_RESERVATION_PAGE_SELECT_ROOM_FROM_MAP_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(CancelReservationPageEnumIos.CANCEL_RESERVATION_PAGE_SEARCH_ROOM_IOS_IN_MAP_XPATH, driver);
        }
    }
    public void clickOnRoomInMap() throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        Dimension dim = driver.manage().window().getSize();
        int x = dim.getWidth() / 2;
        int y = dim.getHeight() / 2;
        DriverActions.action_clickOnPosition(x, y, driver);
    }
}