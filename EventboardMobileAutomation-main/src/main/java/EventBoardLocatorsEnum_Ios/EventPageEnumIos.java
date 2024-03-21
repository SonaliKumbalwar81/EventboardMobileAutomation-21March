package EventBoardLocatorsEnum_Ios;
public enum EventPageEnumIos {
    EVENT_PAGE_EVENT_IOS_XPATH("//XCUIElementTypeButton[@name='quickEvent']"),
    EVENT_PAGE_SHORT_EVENT_XPATH_IOS_XPATH("(//XCUIElementTypeButton[@name='ReserveButtonViewController.button'])[1]"),
    EVENT_PAGE_LONG_EVENT_IOS_XPATH("(//XCUIElementTypeButton[@name='ReserveButtonViewController.button'])[2]"),
    EVENT_PAGE_END_MEETING_EVENT_IOS_XPATH("(//XCUIElementTypeStaticText[@name='End Meeting'])[3]"),
    EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_IOS_XPATH("//XCUIElementTypeButton[@name='endMeeting']"),
    EVENT_PAGE_END_EVENT_NO_PAGE_IF_EXISTS_BUTTON_IOS_XPATH("(//XCUIElementTypeStaticText[@name='No'])[3]");

    public final String description;
    EventPageEnumIos(String enumDescription)
    {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}



