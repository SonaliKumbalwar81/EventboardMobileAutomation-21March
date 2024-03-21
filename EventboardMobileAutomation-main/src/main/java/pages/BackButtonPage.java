package pages;
import EventBoardLocatorsEnum_android.BackButtonEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class BackButtonPage {
    public ExtentTest testLog;
    public static AppiumDriver driver;
    public BackButtonPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickOnBackButton() {
        Allure.step("clicking On Back button  On Menu ");
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(BackButtonEnum.BACK_BUTTON_ENUM_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(BackButtonEnum.BACK_BUTTON_ENUM_XPATH, driver);
        }
    }
    }