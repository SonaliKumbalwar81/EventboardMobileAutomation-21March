package EventBoardLocatorsEnum_Ios;
public enum ReportAnIssuePageEnumIos {
    REPORT_AN_ISSUE_PAGE_IOS_XPATH("//XCUIElementTypeStaticText[@name='Report an Issue']"),
    REPORT_AN_ISSUE_PAGE_AV_BRIDGE_XPATH("//XCUIElementTypeStaticText[@name='A/V Bridge']"),
    REPORT_AN_ISSUE_PAGE_AMENITIES_IOS_XPATH("//XCUIElementTypeKey[@name='P']"),
    REPORT_AN_ISSUE_PAGE_OK_REPORT_SUBMITTED_SUCCESSFULLY_IOS_XPATH("(//XCUIElementTypeStaticText[@name='OK'])[3]"),
    REPORT_AN_ISSUE_PAGE_SUBMIT_IOS_AMENITIES_IOS_XPATH("//XCUIElementTypeStaticText[@name='SUBMIT']");
    public final String description;
    ReportAnIssuePageEnumIos(String enumDescription)
    {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
}

