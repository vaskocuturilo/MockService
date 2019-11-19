package info.testengineer.base;

import info.testengineer.environment.Environment;
import info.testengineer.listener.AllureScreenShooter;
import org.testng.annotations.*;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.Configuration.baseUrl;
import static info.testengineer.browser.Browsers.selectBrowser;
import static info.testengineer.webconfig.WebConfig.BASE_CONFIG;

/**
 * The type Base web.
 */
@Listeners(AllureScreenShooter.class)
public class BaseWeb {

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
        if (Environment.isCheckOperationSystem()) {
            selectBrowser("remote");
        } else {
            selectBrowser(browser);
            clearBrowserCache();
        }
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
