package info.testengineer.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Profile page.
 */
public class ProfilePage {

    /**
     * Constant WELCOME_TEXT.
     */
    private static final String WELCOME_TEXT = "Welcome to my Profile";

    /**
     * Constant ERROR_TEXT.
     */
    private static final String ERROR_TEXT = "Error Login Page";

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * private selenide element.
     */
    private final transient SelenideElement
            verifyText = $("#table1 td.content h1"),
            logout = $("tr[class='head'] a");

    /**
     * Default constructor.
     */
    public ProfilePage() {
        super();
        //empty
        return;
    }

    /**
     * Assert profile profile page.
     *
     * @return the profile page
     */
    public ProfilePage assertProfile() {


        checkResult(WELCOME_TEXT);
        return this;
    }

    /**
     * Check error message profile page.
     *
     * @return the profile page
     */
    public ProfilePage checkErrorMessage() {

        checkResult(ERROR_TEXT);

        return this;
    }


    /**
     * Check result.
     *
     * @param text this is text for validation.
     */
    private void checkResult(final String text) {

        verifyText.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(text));

        logout.click();

    }

}
