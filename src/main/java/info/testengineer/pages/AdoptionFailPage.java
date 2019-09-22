package info.testengineer.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Adoption fail page.
 */
public class AdoptionFailPage {

    /**
     * The constant TEXT.
     */
    private static final String TEXT = "SORRY, NOT AVAILABLE";

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement
            context = $("p[id='result']"),
            back = $("tr[class='head'] a");

    /**
     * The default constructor.
     */
    public AdoptionFailPage() {
        super();
        //empty
        return;
    }

    /**
     * Check adoption fail adoption fail page.
     *
     * @return the adoption fail page
     */
    public AdoptionFailPage checkAdoptionFail() {
        context.shouldHave(Condition.text(TEXT));
        back.click();

        return this;
    }
}
