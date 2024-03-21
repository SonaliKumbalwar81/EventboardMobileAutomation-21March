package EventBoardLocatorsEnum_Ios;
public enum MapPageNoBuildingConfiguredEnumIos {
    MAP_MAP_MAIN_IOS_XPATH("//XCUIElementTypeButton[@name='showMap']"),
    MAP_CAMPUS_DROPDOWN_IOS_XPATH("(//XCUIElementTypeImage[@name='icon_campus'])[1]"),
    MAP_BUILDING_DROPDOWN_IOS_XPATH("(//XCUIElementTypeImage[@name='icon_campus'])[2]");
    public final String description;
    MapPageNoBuildingConfiguredEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}