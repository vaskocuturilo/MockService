package info.testengineer.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Login page.
 */
public class LoginPage {

    /**
     * The private selenide element.
     */
    private final transient SelenideElement

            loginField = $("input[id='login_field']"),
            passwordField = $("input[id='password_field']"),
            loginButton = $("input[id = 'login_button']");

    /**
     * Instantiates a new Login page.
     */
    public LoginPage() {
        super();
        //empty
        return;
    }

    /**
     * Enter login login page.
     *
     * @param userLogin the user login
     * @return the login page
     */
    public LoginPage enterLogin(final String userLogin) {

        loginField.setValue(userLogin);

        return this;
    }

    /**
     * Enter password login page.
     *
     * @param userPassword the user password
     * @return the login page
     */
    public LoginPage enterPassword(final String userPassword) {

        passwordField.setValue(userPassword);
        return this;
    }

    /**
     * Click login button login page.
     *
     * @return the login page
     */
    public LoginPage clickLoginButton() {

        loginButton.click();

        return this;
    }

    /**
     * Enter credential and login profile page.
     *
     * @param userLogin    the user login
     * @param userPassword the user password
     * @return the profile page
     */
    public ProfilePage enterCredentialAndLogin(final String userLogin, final String userPassword) {
        enterLogin(userLogin);
        enterPassword(userPassword);
        clickLoginButton();
        return new ProfilePage();
    }
}
