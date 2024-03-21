package EventBoardLocatorsEnum_android;
public enum ListPageEnum {
    MAP_LIST_XPATH("//android.widget.ImageButton[@content-desc='List']");
    ListPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;

}