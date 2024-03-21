package EventBoardLocatorsEnum_Ios;
public enum SettinglPageEnumIos {
    SETTING_PAGE_IOS_XPATH("//XCUIElementTypeButton[@name='OnboardingViewController.settingsButton']"),
    SETTING_TEXT_PAGE_IOS_XPATH("//XCUIElementTypeStaticText[@name='Settings']"),
    VERSION_NUMBER_PAGE_IOS_XPATH("//XCUIElementTypeStaticText[@name='EventBoard v2.12.3']"),
    SETTING_PAGE_BACK_ARROW_IOS_XPATH("//XCUIElementTypeStaticText[@name='Back']"),
    SETTING_ACKNOWLEDGE_IOS_XPATH("//XCUIElementTypeStaticText[@name='Acknowledgements']"),
    LOG_OUT_IOS_XPATH("//XCUIElementTypeStaticText[@name='Log-Out']"),
    SETTING_LAUNCH_TAP_TO_START_IOS_XPATH("//XCUIElementTypeStaticText[@name='CountDownView.subTitleLabel']"),
    SETTING_PAGE_LOG_OUT_CANCEL_IOS_XPATH("(//XCUIElementTypeStaticText[@name='Cancel'])[3]");
    SettinglPageEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}