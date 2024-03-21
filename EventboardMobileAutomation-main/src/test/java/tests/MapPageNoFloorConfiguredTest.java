package tests;

import Utils.Constants;
import driverManagement.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MapPageNoFloorConfigured;

import java.io.IOException;

public class MapPageNoFloorConfiguredTest extends BaseTest {
    @Test(testName = "Verify  User is able to see No Floor Configured  after Campus Selection which doesn't have a floor or building ")
    @Description("No floor configured  after Campus Selection which doesn't have a floor or building on Map page")
    public void verifyMapNoFloorConfig() throws IOException {
        MapPageNoFloorConfigured map2 = new MapPageNoFloorConfigured(driver, extentlog);
        map2.clickMap();
        map2.clickCampusDropdownNoFloor();
        map2.selectCampusDropdown(Constants.getData().getCellData("Data", "Campus", 4));
        map2.clickBuildingDropdownNoFloor();
        map2.selectBuildingDropdownNofloor(Constants.getData().getCellData("Data", "Building", 4));
        map2.clickFloorDropdownNoFloor();
        map2.selectFloorDropdownNofloor(Constants.getData().getCellData("Data", "Building", 4));
    }
}










