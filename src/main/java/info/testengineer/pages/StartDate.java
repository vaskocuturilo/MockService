package info.testengineer.pages;


/**
 * The enum Start date.
 */
public enum StartDate {

    /**
     * Select start date.
     */
    SELECT("Please select any date from drop-down"),
    /**
     * Yesterday start date.
     */
    YESTERDAY("Yesterday"),
    /**
     * Today start date.
     */
    TODAY("Today"),

    /**
     * Tomorrow start date.
     */
    TOMORROW("Tomorrow");

    /**
     * The private value date.
     */
    private String date;

    /**
     * Constructor.
     *
     * @param selectDate this is value date.
     */
    StartDate(final String selectDate) {
        this.date = selectDate;
    }

    /**
     * Gets date.
     *
     * @return the date.
     */
    public String getDate() {
        return date;
    }
}
