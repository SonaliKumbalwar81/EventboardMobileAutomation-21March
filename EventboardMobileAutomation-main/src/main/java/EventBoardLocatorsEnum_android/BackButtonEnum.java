package EventBoardLocatorsEnum_android;
public enum BackButtonEnum {
    BACK_BUTTON_ENUM_XPATH("//android.widget.ImageButton");
    BackButtonEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}