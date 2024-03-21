package EventBoardLocatorsEnum_android;
public enum ReportAnIssuePageEnum {
    REPORT_AN_ISSUE_PAGE_ID("enderlabs.eventboardandroid.full:id/fLIssue"),
    REPORT_AN_ISSUE_PAGE_AV_BRIDGE_BUTTON_XPATH("(//android.widget.ImageView[@content-desc='What Type of Issue?'])[2]"),
    REPORT_AN_ISSUE_PAGE_AMENITIES_ID("enderlabs.eventboardandroid.full:id/issueEditText"),
    REPORT_AN_ISSUE_PAGE_SUBMIT_AMENITIES_ID("enderlabs.eventboardandroid.full:id/fLIssue");
    ReportAnIssuePageEnum(String enumDescription) {
        this.description = enumDescription;
    }
    @Override
    public String toString() {
        return this.description;
    }
    public final String description;
}