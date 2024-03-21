package EventBoardLocatorsEnum_Ios;
public enum BackButtonRoomInformationEnumIos {
    BACK_BUTTON_ENUM_IOS_XPATH("//XCUIElementTypeImage[@name='back-button-arrow']");
    BackButtonRoomInformationEnumIos(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}