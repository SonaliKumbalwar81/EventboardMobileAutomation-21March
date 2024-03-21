package tests;
import Utils.Constants;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.MapPageNoBuildingConfigured;
import java.io.IOException;
public class MapPageNoBuildingConfiguredTest extends BaseTest {
    @Test(testName = "Verify  User is able to see No Floor Configured  after Campus Selection which doesn't have a floor or building ")
    @Description(" No floor configured  after Campus Selection which doesn't have a floor or building on Map page ")
    public void verifyMapNoFloorConfig() throws IOException {
        LaunchPage lp = new LaunchPage(driver, extentlog);
        lp.clickTabToStop();
        lp.clickLaunchButton();
        MapPageNoBuildingConfigured map1 = new MapPageNoBuildingConfigured(driver, extentlog);
        map1.clickMap();
        map1.clickCampusDropdownNoFloor();
        map1.selectCampusDropdown(Constants.getData().getCellData("Data", "Campus", 3));
        map1.clickBuildingDropdownNoFloor();
        map1.selectBuildingDropdownNofloor(Constants.getData().getCellData("Data", "Building", 3));
    }
}










