package info.testengineer.pages;

import com.codeborne.selenide.Selenide;
import info.testengineer.base.BaseWeb;


/**
 * The abstract class Abstract page.
 */
public abstract class AbstractPage extends BaseWeb {

    /**
     * The constructor.
     */
    public AbstractPage() {
        super();
        //empty
        return;
    }

    /**
     * Open page.
     *
     * @param url this is url.
     */
    public void openPage(final String url) {

        Selenide.open(url);
    }
}
