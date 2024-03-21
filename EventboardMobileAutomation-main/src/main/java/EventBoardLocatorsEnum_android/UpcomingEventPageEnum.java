package EventBoardLocatorsEnum_android;
public enum UpcomingEventPageEnum {
    UPCOMING_PAGE_RESERVED_MEETING_PAGE_ID("enderlabs.eventboardandroid.full:id/cell_title"),
    UPCOMING_PAGE_DELETE_EVENT_XPATH("//android.widget.Button[@content-desc='Delete event']"),
    UPCOMING_PAGE_DELETE_EVENT_OK_XPATH("//android.widget.Button[@text='OK']"),
    UPCOMING_PAGE_DELETE_EVENT_CANCEL_XPATH("//android.widget.Button[@@text='CANCEL']");
    UpcomingEventPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString()
    {
        return this.description;
    }
    public final String description;
}

























