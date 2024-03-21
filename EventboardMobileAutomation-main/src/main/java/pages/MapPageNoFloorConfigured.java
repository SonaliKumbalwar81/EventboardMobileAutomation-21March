package pages;
import EventBoardLocatorsEnum_Ios.MapPageNoFloorConfiguredEnumIos;
import EventBoardLocatorsEnum_android.MapPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MapPageNoFloorConfigured {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public MapPageNoFloorConfigured(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickMap() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_MAP_MAIN_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoFloorConfiguredEnumIos.MAP_MAP_MAIN_NO_FLOOR_IOS_XPATH, driver);
        }
    }
    public void clickCampusDropdownNoFloor() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_CAMPUS_DROPDOWN_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoFloorConfiguredEnumIos.MAP_CAMPUS_DROPDOWN_NO_FLOOR_IOS_XPATH, driver);
        }
    }
    public void clickBuildingDropdownNoFloor() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_BUILDING_DROPDOWN_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoFloorConfiguredEnumIos.MAP_BUILDING_DROPDOWN_NO_FLOOR_IOS_XPATH, driver);
        }
    }
    public void clickFloorDropdownNoFloor() {
        if (driver.getCapabilities().getCapability("platformName").toString().
                equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_BUILDING_DROPDOWN_ID, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageNoFloorConfiguredEnumIos.MAP_FLOOR_DROPDOWN_NO_FLOOR_IOS_XPATH, driver);
        }
    }
    public void selectBuildingDropdownNofloor(String Building) {
        String buildinglocator = "//XCUIElementTypeStaticText[@name='Building_A']";
        driver.findElement(By.xpath(buildinglocator)).click();
    }
    public void selectFloorDropdownNofloor(String Floor) {
        String buildinglocator = "//XCUIElementTypeStaticText[@name='No Floor Configured']";
        driver.findElement(By.xpath(buildinglocator)).click();
    }
    public void selectCampusDropdown(String Campus) {
        String campuslocator = "//XCUIElementTypeStaticText[@name='Only Campus and Building(no Floor)']";
        driver.findElement(By.xpath(campuslocator)).click();
    }
}