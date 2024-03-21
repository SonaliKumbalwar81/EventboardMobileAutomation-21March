package EventBoardLocatorsEnum_Ios;
public enum UpcomingEventPageEnumIos {
    UPCOMING_PAGE_RESERVED_MEETING_PAGE_IOS_XPATH("(//XCUIElementTypeStaticText[@name='Reserved Meeting'])[2]"),
    UPCOMING_PAGE_CANCEL_EVENT_IOS_XPATH("(//XCUIElementTypeButton[@name='endMeeting'])[2]"),
    UPCOMING_PAGE_DELETE_EVENT_NO_IOS_XPATH("(//XCUIElementTypeStaticText[@name='No'])[3]"),
    UPCOMING_PAGE_DELETE_EVENT_DONE_IOS_XPATH("//XCUIElementTypeButton[@name='done']"),
    UPCOMING_PAGE_DELETE_EVENT_YES_IOS_XPATH("(//XCUIElementTypeStaticText[@name='Yes'])[3]");
    UpcomingEventPageEnumIos(String enumDescription)
    {
        this.description = enumDescription;
    }
    @Override
    public String toString()
    {
        return this.description;
    }
    public final String description;
}