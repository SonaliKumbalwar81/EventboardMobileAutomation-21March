package EventBoardLocatorsEnum_Ios;
public enum CancelReservationPageEnumIos {
    CANCEL_RESERVATION_PAGE_CANCEL_IOS_XPATH("//XCUIElementTypeStaticText[@name='NO']"),
    CANCEL_RESERVATION_PAGE_SEARCH_MAP_IOS_XPATH("//XCUIElementTypeButton[@name='search icon']"),
    CANCEL_RESERVATION_PAGE_SEARCH_ROOM_IOS_IN_MAP_XPATH("(//XCUIElementTypeStaticText[@name=\"RESERVE\"])[1]"),
    CANCEL_RESERVATION_PAGE_ENTER_ROOM_NAME_IOS_XPATH("//XCUIElementTypeTextField");
    public final String description;
    CancelReservationPageEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}