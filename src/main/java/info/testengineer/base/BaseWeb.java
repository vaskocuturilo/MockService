package info.testengineer.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.Configuration.baseUrl;
import static info.testengineer.browser.Browsers.selectBrowser;
import static info.testengineer.webconfig.WebConfig.BASE_CONFIG;

/**
 * The type Base web.
 */
public class BaseWeb  {

    /**
     * Instantiates a new Base info.testengineer.web.
     */
    public BaseWeb() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     *
     * @param browser this is value for select browser.
     */
    @Parameters({"browser"})
    @BeforeTest
    public void beforeTest(@Optional("chrome") final String browser) {
        baseUrl = BASE_CONFIG.getWebUrl();
        selectBrowser(browser);
        clearBrowserCache();
    }

    /**
     * After test.
     */
    @AfterTest
    public void afterTest() {
        clearBrowserCache();
        closeWebDriver();
    }
}
