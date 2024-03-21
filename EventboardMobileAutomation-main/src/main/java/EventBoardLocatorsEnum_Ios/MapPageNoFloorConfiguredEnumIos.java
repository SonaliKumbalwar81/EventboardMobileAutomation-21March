package EventBoardLocatorsEnum_Ios;
public enum MapPageNoFloorConfiguredEnumIos {
    MAP_MAP_MAIN_NO_FLOOR_IOS_XPATH("//XCUIElementTypeButton[@name='showMap']"),
    MAP_CAMPUS_DROPDOWN_NO_FLOOR_IOS_XPATH("(//XCUIElementTypeImage[@name='icon_chevron_up'])[1]"),
    MAP_BUILDING_DROPDOWN_NO_FLOOR_IOS_XPATH("(//XCUIElementTypeImage[@name='icon_chevron_up'])[2]"),
    MAP_FLOOR_DROPDOWN_NO_FLOOR_IOS_XPATH("(//XCUIElementTypeImage[@name='icon_chevron_up'])[3]");
    public final String description;
    MapPageNoFloorConfiguredEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}