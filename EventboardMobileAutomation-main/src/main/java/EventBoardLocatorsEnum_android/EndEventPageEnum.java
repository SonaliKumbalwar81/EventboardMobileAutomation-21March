package EventBoardLocatorsEnum_android;
public enum EndEventPageEnum {
    EVENT_PAGE_END_EVENT_DISMISS_XPATH("//android.widget.Button[@text='DISMISS']"),
    EVENT_PAGE_END_EVENT_END_XPATH("//android.widget.Button[@text='END EVENT']");
    public final String description;
    EndEventPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}