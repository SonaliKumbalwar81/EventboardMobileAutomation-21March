package EventBoardLocatorsEnum_Ios;
public enum ListPageEnumIos {
    LIST_PAGE_IOS_XPATH("(//XCUIElementTypeButton[@name='OnboardingViewController.settingsButton'])[2]"),
    LIST_PAGE_RESERVE_IOS_XPATH("(//XCUIElementTypeStaticText[@name='RESERVE'])[2]"),
    LIST_PAGE_AVAILABLE_SPACES_RESERVE_IOS_XPATH("(//XCUIElementTypeStaticText[@name=‘Spaces Available for’])[1]"),
    LIST_PAGE_DAY_DATE_IOS_XPATH("(//XCUIElementTypeStaticText[@name='CheckInViewController.upNextLabel'])[2]"),
    LIST_PAGE_VERIFY_TIME_IOS_XPATH("//XCUIElementTypeStaticText[@name='ReserveViewController.instructionLabel']");
    public final String description;
    ListPageEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}



