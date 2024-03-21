package pages;
import EventBoardLocatorsEnum_Ios.ListPageEnumIos;
import EventBoardLocatorsEnum_android.ListPageEnum;
import EventBoardLocatorsEnum_android.MenuPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
public class ListPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public ListPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickOnList() {
        Allure.step("clicking on List");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ListPageEnum.MAP_LIST_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ListPageEnumIos.LIST_PAGE_IOS_XPATH, driver);
        }
    }
    public void clickOnReserveOnList() {
        Allure.step("clicking click On Reserve On List");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ListPageEnumIos.LIST_PAGE_RESERVE_IOS_XPATH, driver);
        }
    }
    public Boolean verifySpacesAvailableOnReserveOnList() {
        Allure.step("verify msg SpacesAvailableOnReserveOnList");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.isDisplayed(ListPageEnumIos.LIST_PAGE_AVAILABLE_SPACES_RESERVE_IOS_XPATH, driver);
        }
        return null;
    }
    public Boolean verifydayDateOnReserveOnList() {
        Allure.step("verifydayDateOnReserveOnList");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.isDisplayed(ListPageEnumIos.LIST_PAGE_DAY_DATE_IOS_XPATH, driver);
        }
        return null;
    }
    @Step("Step 2: Verify time on List  button ")
    public Boolean verifyTimeOnReserveOnList() {
        Allure.step("verify Time On Reserve List");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.isDisplayed(MenuPageEnum.MENU_PAGE_RESERVE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.isDisplayed(ListPageEnumIos.LIST_PAGE_VERIFY_TIME_IOS_XPATH, driver);
        }
        return null;
    }
}