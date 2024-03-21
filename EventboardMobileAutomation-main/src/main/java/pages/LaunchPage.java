package pages;
import EventBoardLocatorsEnum_android.LaunchPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class LaunchPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public LaunchPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickLaunchButton() {
        Allure.step("clicking on Launch");
        DriverActions.clickOnElement(LaunchPageEnum.LAUNCH_PAGE_LAUNCH_BUTTON_XPATH, driver);
    }
    public void clickTabToStop() {
        Allure.step("clicking on TabToStop");
        DriverActions.clickOnElement(LaunchPageEnum.MENU_PAGE_TAB_TO_STOP_XPATH, driver);
    }
}