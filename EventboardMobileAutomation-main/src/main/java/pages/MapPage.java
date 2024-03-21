package pages;
import EventBoardLocatorsEnum_Ios.MapPageEnumIos;
import EventBoardLocatorsEnum_android.MapPageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
public class MapPage {
    public ExtentTest testLog;
    public AppiumDriver driver;

    public MapPage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickMap() {
        Allure.step("clicking on Enter Room name");
        if (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Android")) {
            DriverActions.clickOnElement(MapPageEnum.MAP_MAP_MAIN_XPATH, driver);
        } else if
        (driver.getCapabilities().getCapability("platformName").toString().equalsIgnoreCase("Ios")) {
            DriverActions.clickOnElement(MapPageEnumIos.MAP_MAP_MAIN_IOS_FOR_CANCEL_XPATH, driver);
        }
    }
    public void clickCampusDropdown() {
        DriverActions.clickOnElement(MapPageEnum.MAP_CAMPUS_DROPDOWN_ID, driver);
    }
    public void clickBuildingDropdown() {
        DriverActions.clickOnElement(MapPageEnum.MAP_BUILDING_DROPDOWN_ID, driver);
    }
    public void clickFloorDropdown() {
        DriverActions.clickOnElement(MapPageEnum.MAP_FLOOR_DROPDOWN_ID, driver);
    }
    public void selectFloorDropdown(String Floor) {
        String floorlocator = "//android.widget.TextView[@text='" + Floor + "']";
        driver.findElement(By.xpath(floorlocator)).click();
    }
    public void selectCampusDropdown(String Campus) {
        String campuslocator = "//android.widget.TextView[@text='" + Campus + "']";
        driver.findElement(By.xpath(campuslocator)).click();
    }
    public void selectBuildingDropdown(String Building) {
        String buildinglocator = "//android.widget.TextView[@text='" + Building + "']";
        driver.findElement(By.xpath(buildinglocator)).click();
    }
    public String verifyTitleText() {
        return DriverActions.getText(MapPageEnum.MAP_TITLETEXT_ID, driver);
    }
    public void clickOnMapButton() {
        DriverActions.clickOnElement(MapPageEnum.MAP_BUTTON_XPATH, driver);
    }
}