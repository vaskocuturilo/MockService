package info.testengineer.base;

import info.testengineer.mock.MockEmailService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


/**
 * The type Base email.
 */
public class BaseEmail {

    /**
     * The constant PORT.
     */
    private static final int PORT = 9010;

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
        emailService.startEmailServer(PORT);
    }

    /**
     * After test.
     */
    @AfterTest(alwaysRun = true)
    public void afterTest() {
        emailService.stop();
    }
}
