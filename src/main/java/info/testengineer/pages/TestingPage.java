package info.testengineer.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The class Testing page.
 */
public class TestingPage {

    /**
     * The constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * The private Selenide Element.
     */
    private final transient SelenideElement
            selectDate = $("select[id='start_select']"),
            adoptionFail = $("input[id='check_first_btn']"),
            adoptionPass = $("input[id='check_second_btn']");

    /**
     * The constructor.
     */
    public TestingPage() {
        super();
        //empty
        return;
    }

    /**
     * Method select sort by search page.
     *
     * @param startDate this is start date from enum class.
     * @return the search page.
     */
    public TestingPage selectSortBy(final StartDate startDate) {
        if (!startDate.equals(StartDate.SELECT)) {
            selectSortByOptionByName(startDate);
        }
        return this;
    }

    /**
     * Method select Adoption Pass.
     *
     * @return Adoption Pass.
     */
    public AdoptionPassPage selectAdoptionPass() {

        adoptionPass.click();

        return new AdoptionPassPage();
    }

    /**
     * Method select Adoption Fail.
     *
     * @return Adoption Fail.
     */
    public AdoptionFailPage selectAdoptionFail() {

        adoptionFail.click();

        return new AdoptionFailPage();
    }


    /**
     * Method select sort by option by name.
     *
     * @param startDate this is date from enum.
     */
    private void selectSortByOptionByName(final StartDate startDate) {
        selectDate.waitUntil(Condition.visible, DELAY).click();
        selectDate.selectOptionContainingText(startDate.getDate());
    }

}
