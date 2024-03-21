package EventBoardLocatorsEnum_android;
public enum BusyRoomPopupPageEnum {
    EVENT_PAGE_EVENT_XPATH("(//android.widget.RelativeLayout[@content-desc='Create reservation'])[2]/android.widget.ImageView"),
    EVENT_PAGE_LONG_EVENT_XPATH("//android.widget.Button[@content-desc='Select second reservation option']"),
    EVENT_PAGE_BUSY_ROOM_POP_UP_XPATH("//android.widget.TextView[@text='Busy Room']"),
    EVENT_PAGE_RESERVATION_CONFIRMATION_SCREEN_DONE_BTN_XPATH("//android.widget.Button[@text='DONE']"),
    EVENT_PAGE_CANCEL_BUTTON_XPATH("//android.widget.Button[@text='CANCEL']"),
    EVENT_PAGE_OK_BUTTON_XPATH("//android.widget.Button[@text='OK']");
    public final String description;
    BusyRoomPopupPageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}