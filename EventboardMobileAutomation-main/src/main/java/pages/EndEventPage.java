package pages;
import EventBoardLocatorsEnum_Ios.EventPageEnumIos;
import EventBoardLocatorsEnum_android.EndEventPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
public class EndEventPage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public EndEventPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void endCurrentEventDismiss() {
        Allure.step("Cancel  existing  end event ");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EndEventPageEnum.EVENT_PAGE_END_EVENT_DISMISS_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_END_EVENT_NO_PAGE_IF_EXISTS_BUTTON_IOS_XPATH, driver);
        }
    }
    public void endCurrentEventEndMeeting() {
        Allure.step("Delete existing event");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(EndEventPageEnum.EVENT_PAGE_END_EVENT_END_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(EventPageEnumIos.EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_IOS_XPATH, driver);
        }
    }
}