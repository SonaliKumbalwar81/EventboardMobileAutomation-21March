package pages;
import EventBoardLocatorsEnum_Ios.MapPageNoBuildingConfiguredEnumIos;
import EventBoardLocatorsEnum_android.MapPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
public class MapPageNoBuildingConfigured {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public MapPageNoBuildingConfigured(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickMap() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_MAP_MAIN_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoBuildingConfiguredEnumIos.MAP_MAP_MAIN_IOS_XPATH, driver);
        }
    }
    public void clickCampusDropdownNoFloor() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_CAMPUS_DROPDOWN_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoBuildingConfiguredEnumIos.MAP_CAMPUS_DROPDOWN_IOS_XPATH, driver);
        }
    }
    public void clickBuildingDropdownNoFloor() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_BUILDING_DROPDOWN_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoBuildingConfiguredEnumIos.MAP_BUILDING_DROPDOWN_IOS_XPATH, driver);
        }
    }
    public void selectBuildingDropdownNofloor(String Building) {
        String buildinglocator = "//XCUIElementTypeStaticText[@name='No Building Configured']";
        driver.findElement(By.xpath(buildinglocator)).click();
    }
    public void selectCampusDropdown(String Campus) {
        String campuslocator = "//XCUIElementTypeStaticText[@name='Only Campus']";
        driver.findElement(By.xpath(campuslocator)).click();
    }
}