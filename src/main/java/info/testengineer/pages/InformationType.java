package info.testengineer.pages;

/**
 * The enum Information type.
 */
public enum InformationType {

    /**
     * Volunteer information type.
     */
    VOLUNTEER("cdona"),
    /**
     * Newsletter information type.
     */
    NEWSLETTER("cadop");

    /**
     * The private value type.
     */
    private String type;

    /**
     * The constructor.
     *
     * @param selectType thi is value selectType for selectors from drop-down list on Contact Page.
     */
    InformationType(final String selectType) {
        this.type = selectType;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
}
