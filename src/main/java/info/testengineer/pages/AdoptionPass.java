package info.testengineer.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Adoption pass.
 */
public class AdoptionPass {

    /**
     * The constant ASSERT_TEXT.
     */
    private static final String ASSERT_TEXT = "YOUR TESTING HAS BEEN SET UP";

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "CONGRATULATIONS, AVAILABLE";

    /**
     * The rpivate Selenide Elements.
     */
    private final transient SelenideElement

            conText = $("p[id='result']"),
            name = $("input[name='name_field']"),
            address = $("input[name='address_field']"),
            postCode = $("input[name='postcode_field']"),
            email = $("input[name='email_field']"),
            adoptionCheck = $("input[id='submit_adoption']"),
            assertText = $("td[class='content'] p"),
            backLink = $("tr[class='head'] a");


    /**
     * Constructor.
     */
    public AdoptionPass() {
        super();
        //empty
        return;
    }

    /**
     * Add adoption data adoption pass.
     *
     * @param userName     the user name
     * @param userAddress  the user address
     * @param userPostCode the user post code
     * @param userEmail    the user email
     * @return the adoption pass
     */
    public AdoptionPass addAdoptionData(final String userName,
                                        final String userAddress,
                                        final String userPostCode,
                                        final String userEmail) {
        conText.shouldHave(Condition.text(TEXT));
        name.setValue(userName);
        address.setValue(userAddress);
        postCode.setValue(userPostCode);
        email.setValue(userEmail);
        adoptionCheck.click();
        assertText.shouldHave(Condition.text(ASSERT_TEXT));
        backLink.click();
        return this;
    }

}
