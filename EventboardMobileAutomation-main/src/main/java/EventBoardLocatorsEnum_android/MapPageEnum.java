package EventBoardLocatorsEnum_android;
public enum MapPageEnum {
    MAP_MAP_MAIN_XPATH("(//android.widget.RelativeLayout[@content-desc='Open map'])[2]/android.widget.ImageView"),
    MAP_TITLETEXT_ID("enderlabs.eventboardandroid.full:id/titleText"),
    MAP_CAMPUS_DROPDOWN_ID("enderlabs.eventboardandroid.full:id/campusSpinner"),
    MAP_BUILDING_DROPDOWN_ID("enderlabs.eventboardandroid.full:id/buildingSpinner"),
    MAP_FLOOR_DROPDOWN_ID("enderlabs.eventboardandroid.full:id/floorSpinner"),
    MAP_SELECT_CAMPUS_DROP_DOWN_XPATH("//android.widget.TextView[@text='\"+Campus+\"']"),
    MAP_SELECT_BUILDING_DROP_DOWN_XPATH("//android.widget.TextView[@text='\"+Building+\"']"),
    MAP_SELECT_FLOOR_DROP_DOWN_XPATH("//android.widget.TextView[@text='\"+Floor+\"']"),
    MAP_LIST_XPATH("//android.widget.ImageButton[@content-desc='List']"),
    MAP_BUTTON_XPATH("//android.widget.ImageButton[@content-desc='Map']");

    MapPageEnum(String enumDescription) {
        this.description = enumDescription;
    }

    @Override
    public String toString() {
        return this.description;
    }

    public final String description;
}