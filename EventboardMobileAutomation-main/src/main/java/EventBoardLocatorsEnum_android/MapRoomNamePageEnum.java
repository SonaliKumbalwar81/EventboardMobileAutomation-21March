package EventBoardLocatorsEnum_android;
public enum MapRoomNamePageEnum {
    MAP_ROOM_NAME_PAGE_SEARCH_MAP_XPATH("//android.widget.ImageButton[@content-desc='Search map']"),
    MAP_ROOM_NAME_PAGE_MAP_XPATH("//android.widget.RelativeLayout[@content-desc='Open map'])[2]/android.widget.ImageView"),
    MAP_ROOM_NAME_PAGE_ENTER_ROOM_NAME_ID("enderlabs.eventboardandroid.full:id/mapsSearchBox"),
    MAP_ROOM_NAME_PAGE_SELECT_ROOM_FROM_MAP_XPATH("(//android.widget.TextView[@resource-id='enderlabs.eventboardandroid.full:id/roomNameTextView'])[1]"),
    //CANCEL_RESERVATION_PAGE_CANCEL_XPATH("//android.widget.Button[@text='CANCEL']");
    MAP_ROOM_NAME_PAGE_SELECT_ROOM_XPATH("//android.widget.TextView[@resource-id='enderlabs.eventboardandroid.full:id/selectRoomValueTextView']");
    MapRoomNamePageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}