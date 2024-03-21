package EventBoardLocatorsEnum_android;
public enum LaunchPageEnum {
    LAUNCH_PAGE_LAUNCH_BUTTON_XPATH("//android.widget.Button[@content-desc='LAUNCH']"),
    MENU_PAGE_TAB_TO_STOP_XPATH("//android.widget.TextView[@text='Tap to Stop']");
    LaunchPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}