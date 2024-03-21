package EventBoardLocatorsEnum_android;
public enum EventPageEnum {
    EVENT_PAGE_EVENT_XPATH("(//android.widget.RelativeLayout[@content-desc='Create reservation'])[2]/android.widget.ImageView"),
    EVENT_PAGE_TITLE_TEXT_XPATH("//android.widget.TextView[@text='Book for']"),
    EVENT_PAGE_SHORT_EVENT_XPATH("//android.widget.Button[@content-desc='Select first reservation option']"),
    EVENT_PAGE_LONG_EVENT_XPATH("//android.widget.Button[@content-desc='Select second reservation option']"),
    EVENT_PAGE_BUSY_ROOM_POP_UP_XPATH("//android.widget.TextView[@text='Busy Room']"),
    EVENT_PAGE_MORE_OPTION_XPATH("//android.widget.TextView[@content-desc='More reservation options']"),
    EVENT_PAGE_RESERVATION_CONFIRMATION_SCREEN_DONE_BTN_XPATH("//android.widget.Button[@text='DONE']"),
    EVENT_PAGE_RESERVATION_CONFIRMATION_TEXT_XPATH("//android.widget.TextView[@text='Reservation Confirmation']"),
    EVENT_PAGE_ROOM_RESERVATION_HEADER_XPATH("//android.widget.TextView[@text='Room Reservation']"),
    EVENT_PAGE_DELETE_EVENT_PAGE_IF_EXISTS_BUTTON_XPATH("//*[@text='Delete EVENTPAGE']"),
    EVENT_PAGE_CANCEL_BUTTON_XPATH("//android.widget.Button[@text='CANCEL']"),
    EVENT_PAGE_OK_BUTTON_XPATH("//android.widget.Button[@text='OK']");
    public final String description;
    EventPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}