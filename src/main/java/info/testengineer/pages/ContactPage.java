package info.testengineer.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Contact page.
 */
public class ContactPage {

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement

            userName = $("input[name='name_field']"),
            userAddress = $("input[name='address_field']"),
            userPostcode = $("input[name='postcode_field']"),
            userEmail = $("input[name='email_field']"),
            send = $("input[id='submit_message']");

    /**
     * The default constructor.
     */
    public ContactPage() {
        super();
        //empty
        return;
    }

    /**
     * Method select Contact Type.
     *
     * @param buttons the buttons
     * @return this.
     */
    public ContactPage selectContactType(final Buttons buttons) {
        $("input[id='" + buttons.getButton() + "']").click();
        return this;
    }

    /**
     * Method checked Information Type.
     *
     * @param informationType this is information type from enum informationType.
     * @return this.
     */
    public ContactPage checkedInformationType(final InformationType informationType) {
        $("input[id='" + informationType.getType() + "']").click();

        return this;
    }

    /**
     * Method add Contact Information.
     *
     * @param name     this is user name.
     * @param address  this is user address.
     * @param postCode this is user postcode.
     * @param email    this is user email.
     * @return the search page.
     */
    public ContactPage addContactInformation(final String name,
                                             final String address,
                                             final String postCode,
                                             final String email) {

        userName.setValue(name);
        userAddress.setValue(address);
        userPostcode.setValue(postCode);
        userEmail.setValue(email);

        return this;
    }

    /**
     * Method sendMessage.
     */
    public ContactConfirmPage sendMessage() {
        send.click();

        return new ContactConfirmPage();
    }


}
