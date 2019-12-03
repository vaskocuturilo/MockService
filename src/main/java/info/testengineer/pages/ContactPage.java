package info.testengineer.pages;

import com.codeborne.selenide.SelenideElement;
import com.google.gson.Gson;
import info.testengineer.util.PropertiesReader;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;


/**
 * The type Contact page.
 */
public class ContactPage extends UserData {

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
     * @param registerData this is string name of json file.
     * @return this.
     */
    public ContactPage addContactInformation(final String registerData) {
        final UserData userData = getJsonData(registerData);

        userName.setValue(userData.getName());
        userAddress.setValue(userData.getAddress());
        userPostcode.setValue(userData.getPostcode());
        userEmail.setValue(userData.getEmail());

        return this;
    }

    /**
     * Method sendMessage.
     *
     * @return this.
     */
    public ContactConfirmPage sendMessage() {
        send.click();

        return new ContactConfirmPage();
    }

    /**
     * Method get Json Data.
     *
     * @param jsonFileName path to file.
     * @return new Gson.
     */
    private static UserData getJsonData(final String jsonFileName) {

        final String pathToFolder = PropertiesReader.getResourceAsString(format("user/%s.json", jsonFileName));

        return new Gson().fromJson(pathToFolder, UserData.class);
    }
}
