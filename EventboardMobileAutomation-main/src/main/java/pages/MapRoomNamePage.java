package pages;
import EventBoardLocatorsEnum_android.MapRoomNamePageEnum;
import com.aventstack.extentreports.ExtentTest;
import com.teem.basedriver.DriverActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;
public class MapRoomNamePage {
    public ExtentTest testLog;
    public AppiumDriver driver;
    public MapRoomNamePage(AppiumDriver driver, ExtentTest testLog) {
        this.driver = driver;
        this.testLog = testLog;
    }
    public void clickOnMap() {
        DriverActions.clickOnElement(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_MAP_XPATH, driver);
    }

    public void EnterRoomName() throws InterruptedException {
        DriverActions.sendKeysToElement(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_ENTER_ROOM_NAME_ID, "Mayank Room", driver);
    }
    public boolean verifyMapRoomNamePage() {
        Allure.step("clicking on Select Room Link");
        //DriverActions.clickOnElement(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_SELECT_ROOM_XPATH, driver);
        return DriverActions.isDisplayed(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_SELECT_ROOM_XPATH, driver);
    }
    public void clickOnSearchMap() {
        DriverActions.clickOnElement(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_SEARCH_MAP_XPATH, driver);
    }
    public void selectRoomFromDropDown() throws InterruptedException {
        DriverActions.clickOnElement(MapRoomNamePageEnum.MAP_ROOM_NAME_PAGE_SELECT_ROOM_FROM_MAP_XPATH, driver);
    }
    public void clickOnRoomInMap() throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        Dimension dim = driver.manage().window().getSize();
        int x = dim.getWidth() / 2;
        int y = dim.getHeight() / 2;
        DriverActions.action_clickOnPosition(x, y, driver);
    }
}