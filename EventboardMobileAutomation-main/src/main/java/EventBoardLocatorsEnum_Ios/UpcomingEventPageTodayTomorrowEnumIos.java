package EventBoardLocatorsEnum_Ios;
public enum UpcomingEventPageTodayTomorrowEnumIos {
    UPCOMING_PAGE_RESERVED_MEETING_PAGE_TOMORROW_IOS_XPATH("(//XCUIElementTypeStaticText[@name='Reserved Meeting'])[3]"),
    UPCOMING_PAGE_RESERVED_MEETING_PAGE_TODAY_IOS_XPATH("(//XCUIElementTypeStaticText[@name='Reserved Meeting'])[2]"),
    UPCOMING_PAGE_DELETE_EVENT_IOS_TODAY_XPATH("//XCUIElementTypeButton[@name='endMeeting' and @label='delete']"),
    UPCOMING_PAGE_CANCEL_EVENT_IOS_TOM_XPATH("//XCUIElementTypeButton[@name='endMeeting' and @label='delete']"),
    UPCOMING_PAGE_DELETE_EVENT_NO_IOS_TODAY_XPATH("(//XCUIElementTypeStaticText[@name='No'])[3]"),
    UPCOMING_PAGE_DELETE_EVENT_NO_IOS_TOM_XPATH("(//XCUIElementTypeStaticText[@name='No'])[3]"),
    UPCOMING_PAGE_DELETE_EVENT_YES_IOS_TODAY_XPATH("(//XCUIElementTypeStaticText[@name='Yes'])[3]"),
    UPCOMING_PAGE_DELETE_EVENT_YES_IOS_TOM_XPATH("(//XCUIElementTypeStaticText[@name='Yes'])[3]");
    UpcomingEventPageTodayTomorrowEnumIos(String enumDescription)
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