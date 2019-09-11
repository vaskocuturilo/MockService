package info.testengineer.base.browser;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;


/**
 * The type Browsers.
 */
public final class Browsers {

    /**
     * The private constructor.
     */
    private Browsers() {
    }

    /**
     * Select browser.
     *
     * @param browser the browser.
     */
    public static void selectBrowser(final String browser) {
        if ("chrome".equalsIgnoreCase(browser)) {
            Configuration.browser = "Chrome";
            ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        } else if ("firefox".equalsIgnoreCase(browser)) {
            Configuration.browser = "firefox";
            ChromeDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        } else if ("opera".equalsIgnoreCase(browser)) {
            Configuration.browser = "opera";
            ChromeDriverManager.getInstance(DriverManagerType.OPERA).setup();
        } else if ("edge".equalsIgnoreCase(browser)) {
            Configuration.browser = "edge";
            ChromeDriverManager.getInstance(DriverManagerType.EDGE).setup();
        } else {
            throw new IllegalStateException(" Browser " + browser + " not supported in this tests. ");
        }
    }
}
