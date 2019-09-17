package info.testengineer.base.browser;

import info.testengineer.mock.MockEmailService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


/**
 * The type Base email.
 */
public class BaseEmail {

    /**
     * The private value emailService.
     */
    private MockEmailService emailService = new MockEmailService();

    /**
     * Default constructor.
     */
    public BaseEmail() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     */
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        emailService.startEmailServer(9010);
    }

    /**
     * After test.
     */
    @AfterTest(alwaysRun = true)
    public void afterTest() {
        emailService.stop();
    }
}
