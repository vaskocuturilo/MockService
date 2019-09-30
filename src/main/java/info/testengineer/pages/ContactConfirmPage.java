package info.testengineer.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Contact confirm page.
 */
public class ContactConfirmPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = " We have your message";

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement

            content = $("td[class='content'] h1"),
            backLink = $("tr[class='head'] a");

    /**
     * The default constructor.
     */
    public ContactConfirmPage() {
        super();
        //empty
        return;
    }

    /**
     * Check that message sent done contact confirm page.
     *
     * @return the contact confirm page
     */
    public ContactConfirmPage checkThatMessageSentDone() {

        content.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(TEXT));
        backLink.click();


        return this;
    }


}
