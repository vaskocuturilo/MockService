package info.testengineer.base;

import com.codeborne.selenide.logevents.SelenideLogger;
import info.testengineer.environment.Environment;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.Configuration.baseUrl;
import static info.testengineer.browser.Browsers.selectBrowser;
import static info.testengineer.webconfig.WebConfig.BASE_CONFIG;

/**
 * The type Base web.
 */

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
     * The method initDBUnitExecution. This method created for added listener. This listener for Allure.
     * screenshots(true) for attach screen.
     */
    @BeforeSuite
    public void initLogger() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
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
        if (Environment.isCheckOperatingSystem()) {
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
