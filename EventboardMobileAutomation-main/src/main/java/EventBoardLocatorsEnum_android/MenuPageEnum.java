package EventBoardLocatorsEnum_android;
public enum MenuPageEnum {
    MENU_PAGE_MENU_XPATH("(//android.widget.RelativeLayout[@content-desc='Open menu'])[2]/android.widget.ImageView"),
    MENU_PAGE_ROOM_INFORMATION_XPATH("//android.widget.ImageView[@content-desc='Room Information']"),
    MENU_PAGE_RESERVED_MEETING_XPATH("//android.widget.EditText[@text='Reserved Meeting']"),
    MENU_PAGE_RESERVE_THIS_ROOM_XPATH("//android.widget.Button[@text='RESERVE THIS ROOM']"),
    MENU_PAGE_RESERVE_XPATH("//android.widget.Button[@text='RESERVE']"),
    MENU_PAGE_SEE_ON_MAP_ID("enderlabs.eventboardandroid.full:id/seeMapTextView"),
    MENU_PAGE_TIME_XPATH("//android.widget.TextView[@resource-id='enderlabs.eventboardandroid.full:id/selectTimeValueTextView']"),
    MENU_PAGE_OK_XPATH("//android.widget.Button[@text='OK']"),
    MENU_PAGE_CHANGE_MONTH_XPATH("//android.widget.Button[@content-desc='Change to next month']"),
    MENU_PAGE_START_TIME_MINUTE_BUTTON_XPATH("(//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/material_minute_text_input'])[1]"),
    MENU_PAGE_END_TIME_MINUTE_BUTTON_XPATH("(//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/material_minute_text_input'])[2]"),
    MENU_PAGE_START_END_TIME_MINUTE_INPUT_XPATH("//android.widget.EditText[@resource-id='enderlabs.eventboardandroid.full:id/material_timepicker_edit_text']"),
    MENU_PAGE_CANCEL_XPATH("//android.widget.Button[@content-desc='Change to next month']"),
    MENU_PAGE_SCHEDULING_CONFLICT_POPUP_XPATH("//android.widget.TextView[@text='Scheduling Conflict']"),
    MENU_PAGE_END_TIME_GREATER_THAN_START_XPATH("//android.widget.TextView[@text='End Time Must Be Greater Than Start Time']"),
    MENU_PAGE_CAN_NOT_CREATE_PAST_RES_XPATH("//android.widget.TextView[@text='Cannot Create Past Reservations']"),
    MENU_PAGE_CAN_NOT_CREATE_RESERVATION_IN_THE_PAST_XPATH("//android.widget.TextView[@text='Cannot create reservation in the past.']"),
    MENU_PAGE_SPACE_IS_BOOKED_XPATH("//android.widget.TextView[@text='Your space is now booked.']"),
    MENU_PAGE_END_TIME_HOUR_XPATH("//*[@resource-id='enderlabs.eventboardandroid.full:id/material_end_textinput_timepicker']//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/material_hour_text_input']"),
    MENU_PAGE_START_TIME_HOUR_INPUT_XPATH("//android.widget.EditText[@resource-id='enderlabs.eventboardandroid.full:id/material_timepicker_edit_text']"),
    MENU_PAGE_START_TIME_HOUR_BUTTON_XPATH("//*[@resource-id='enderlabs.eventboardandroid.full:id/material_start_textinput_timepicker']//android.widget.FrameLayout[@resource-id='enderlabs.eventboardandroid.full:id/material_hour_text_input']"),
    MENU_PAGE_START_TIME_AM_XPATH("(//com.google.android.material.button.MaterialButtonToggleGroup[@content-desc='Select AM or PM']//*[@text='AM'])[1]"),
    MENU_PAGE_END_TIME_AM_XPATH("(//com.google.android.material.button.MaterialButtonToggleGroup[@content-desc='Select AM or PM']//*[@text='AM'])[2]"),
    MENU_PAGE_EVENT_TITLE_XPATH("//android.widget.TextView[@text='Test Event Title']"),
    MENU_PAGE_DATE_XPATH("//android.widget.TextView[@resource-id='enderlabs.eventboardandroid.full:id/selectDateValueTextView']"),
    MENU_PAGE_DONE_XPATH("//android.widget.Button[@text='DONE']");
    MenuPageEnum(String enumDescription) {
        this.description = enumDescription;
    }

    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}