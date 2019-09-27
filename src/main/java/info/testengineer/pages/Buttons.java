package info.testengineer.pages;


/**
 * The enum Buttons.
 */
public enum Buttons {

    /**
     * Information buttons.
     */
    INFORMATION("rinfo"),
    /**
     * Donation buttons.
     */
    DONATION("rdona"),
    /**
     * Testing buttons.
     */
    TESTING("radop");

    /**
     * The private value.
     */
    private String button;

    /**
     * The constructor.
     */
    Buttons(String selectButton) {
        this.button = selectButton;
    }

    /**
     * Gets button.
     *
     * @return the button
     */
    public String getButton() {
        return button;
    }
}
