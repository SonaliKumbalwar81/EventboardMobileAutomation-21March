package EventBoardLocatorsEnum_android;
public enum SettinglPageEnum {
    SETTING_PAGE_XPATH("//android.widget.ImageView[@content-desc='Settings']"),
    VERSION_NUMBER_PAGE_XPATH("//android.widget.TextView[@resource-id='enderlabs.eventboardandroid.full:id/appVersionTextView']"),
    SETTING_PAGE_BACK_ARROW_XPATH("//android.widget.ImageButton"),
    SETTING_LAUNCH_TAP_TO_START_XPATH("//android.widget.TextView[@text='Tap to Stop']"),
    LOG_OUT_XPATH("//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/fLLogOut']"),
    SETTING_ACKNOWLEDGEMENT_XPATH("//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/fLAcknowledgements']");
    SettinglPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;