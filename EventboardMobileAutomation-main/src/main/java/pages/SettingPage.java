package pages;
import EventBoardLocatorsEnum_Ios.SettinglPageEnumIos;
import EventBoardLocatorsEnum_android.SettinglPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class SettingPage {
    public static AppiumDriver driver;
    public ExtentTest testLog;

    public SettingPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickOnSetting() {
        Allure.step("clicking on Setting button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(SettinglPageEnum.SETTING_PAGE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(SettinglPageEnumIos.SETTING_PAGE_IOS_XPATH, driver);
        }
    }
    public void clickOnLogOut() {
        Allure.step("clicking on Logout button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(SettinglPageEnum.LOG_OUT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(SettinglPageEnumIos.LOG_OUT_IOS_XPATH, driver);
        }
    }

    public void ClickOnAcknowledgement() {
        Allure.step("clicking on Acknowledgement button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(SettinglPageEnum.SETTING_ACKNOWLEDGEMENT_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(SettinglPageEnumIos.SETTING_ACKNOWLEDGE_IOS_XPATH, driver);
        }
    }
    public Boolean VerifyVersionNumber() {
        Allure.step("Verify version number");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            return DriverActions.isDisplayed(SettinglPageEnum.VERSION_NUMBER_PAGE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            return DriverActions.isDisplayed(SettinglPageEnumIos.VERSION_NUMBER_PAGE_IOS_XPATH, driver);
        }
        return null;
    }
    public Boolean verifySettingText() {
        Allure.step("Verify setting text");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            return DriverActions.isDisplayed(SettinglPageEnum.SETTING_PAGE_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            return DriverActions.isDisplayed(SettinglPageEnumIos.SETTING_TEXT_PAGE_IOS_XPATH, driver);
        }
        return null;
    }
    public void ClickOnBackArrow() {
        Allure.step("Verify back button");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(SettinglPageEnum.SETTING_PAGE_BACK_ARROW_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(SettinglPageEnumIos.SETTING_PAGE_BACK_ARROW_IOS_XPATH, driver);
        }
    }
    public void clickOnTapToStop() {
        Allure.step("click on Tap To Stop");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(SettinglPageEnum.SETTING_LAUNCH_TAP_TO_START_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(SettinglPageEnumIos.SETTING_LAUNCH_TAP_TO_START_IOS_XPATH, driver);
        }
    }
}