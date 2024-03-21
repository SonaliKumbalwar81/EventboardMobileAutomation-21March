package pages;
import EventBoardLocatorsEnum_Ios.ReportAnIssuePageEnumIos;
import EventBoardLocatorsEnum_android.ReportAnIssuePageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
public class ReportAnIssuePage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public ReportAnIssuePage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickReportAnissueButton() {
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnum.REPORT_AN_ISSUE_PAGE_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnumIos.REPORT_AN_ISSUE_PAGE_IOS_XPATH, driver);
        }
    }
    public void clickAvBridgeButton() {
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnum.REPORT_AN_ISSUE_PAGE_AV_BRIDGE_BUTTON_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnumIos.REPORT_AN_ISSUE_PAGE_AV_BRIDGE_XPATH, driver);
        }
    }
    public void enteramenities() {
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnum.REPORT_AN_ISSUE_PAGE_AMENITIES_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnumIos.REPORT_AN_ISSUE_PAGE_AMENITIES_IOS_XPATH, driver);
        }
    }
    public void submitAmenities() {
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnum.REPORT_AN_ISSUE_PAGE_SUBMIT_AMENITIES_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnumIos.REPORT_AN_ISSUE_PAGE_SUBMIT_IOS_AMENITIES_IOS_XPATH, driver);
        }
    }
    public void clickOnOKReportSubmit() {
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnum.REPORT_AN_ISSUE_PAGE_SUBMIT_AMENITIES_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(ReportAnIssuePageEnumIos.REPORT_AN_ISSUE_PAGE_OK_REPORT_SUBMITTED_SUCCESSFULLY_IOS_XPATH, driver);
        }
    }
}