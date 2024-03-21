package EventBoardLocatorsEnum_Ios;
public enum MenuPageEnumIos {
    MENU_PAGE_MENU_IOS_XPATH("//XCUIElementTypeButton[@name='menu']"),
    MENU_PAGE_RESERVATION_PAGE_CANCEL_SELECT_ROOM_IOS_XPATH("//XCUIElementTypeStaticText[@name='NO']"),
    MENU_PAGE_SELECT_ROOM_IN_MENU_IOS_XPATH("//XCUIElementTypeButton[@name='EBQuickReserveViewController.roomButton']"),
    MENU_PAGE_ROOM_INFORMATION_IOS_XPATH("//XCUIElementTypeStaticText[@name='Room Information']"),
    MENU_PAGE_RESERVE_THIS_ROOM__IOS_XPATH("//XCUIElementTypeStaticText[@name='RESERVE THIS ROOM']"),
    MENU_PAGE_RESERVE_IOS_XPATH("//XCUIElementTypeStaticText[@name='RESERVE']"),
    MENU_PAGE_SELECT_ROOM_RESERVE_IOS_XPATH("(//XCUIElementTypeStaticText[@name='RESERVE'])[2]"),
    MENU_PAGE_DATE_FUTURE_MONTH_IOS_XPATH("//XCUIElementTypeButton[@name='Next Month']"),
    MENU_PAGE__FUTURE_MONTH_DATE_IOS_XPATH("//XCUIElementTypeStaticText[@name='1']"),
    MENU_PAGE_SPACE_IS_BOOKED_IOS_XPATH("//XCUIElementTypeStaticText[@name='Your space is now booked.']"),
    MENU_PAGE_DATE_IOS_XPATH("//XCUIElementTypeButton[@name='EBQuickReserveViewController.dateButton']"),
    MENU_PAGE_DATE_SELECT_ROOM_IOS_XPATH("(//XCUIElementTypeButton[@name='EBQuickReserveViewController.dateButton'])[2]"),
    MENU_PAGE_DATE_SELECT_ROOM_FUTURE_MONTH_IOS_XPATH("//XCUIElementTypeButton[@name='Next Month']"),
    MENU_PAGE_DATE_SELECT_ROOM_FUTURE_MONTH_FIRST_IOS_XPATH("//XCUIElementTypeStaticText[@name='1']"),
    MENU_PAGE_TIME_ON_ROOM_RESERVATION_IOS_XPATH("//XCUIElementTypeButton[contains(@name,'AM')or contains(@name,'PM')]"),
    MENU_PAGE_TIME_DONE_IOS_XPATH("//XCUIElementTypeStaticText[@name='Done']"),
    MENU_PAGE_SEE_ON_MAP_IOS_XPATH("//XCUIElementTypeStaticText[@name='See on Map']"),
    MENU_PAGE_SCHEDULING_CONFLICT_POPUP_IOS_XPATH("//XCUIElementTypeStaticText[@name='BSAlertViewController.titleLabel']"),
    MENU_PAGE_RESERVATION_CONFIRMATION_DONE_ON_IOS_XPATH("//XCUIElementTypeStaticText[@name='DONE']");
    public final String description;
    MenuPageEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}

