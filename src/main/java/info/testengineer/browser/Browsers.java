package info.testengineer.browser;

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
            Configuration.browser = Chrome.class.getName();
        } else if ("firefox".equalsIgnoreCase(browser)) {
            Configuration.browser = Firefox.class.getName();
        } else if ("opera".equalsIgnoreCase(browser)) {
            Configuration.browser = "opera";
            ChromeDriverManager.getInstance(DriverManagerType.OPERA).setup();
        } else if ("edge".equalsIgnoreCase(browser)) {
            Configuration.browser = "edge";
            ChromeDriverManager.getInstance(DriverManagerType.EDGE).setup();
        } else if ("remote".equalsIgnoreCase(browser)) {
            Configuration.browser = Remote.class.getName();
        } else {
            throw new IllegalStateException(" Browser " + browser + " not supported in this tests. ");
        }
    }
}
