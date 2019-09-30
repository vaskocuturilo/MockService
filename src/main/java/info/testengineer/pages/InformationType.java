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

    private String type;

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
