package info.testengineer.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;

import static info.testengineer.mock.MockDatabaseService.*;


/**
 * The type Base database.
 */
public class BaseDatabase {

    /**
     * Default constructor.
     */
    public BaseDatabase() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     *
     * @throws SQLException for method.
     */
    @BeforeSuite(alwaysRun = true)
    public void beforeTest() throws SQLException {
        startServer();
        createTable();


    }

    /**
     * After test.
     *
     * @throws SQLException for method.
     */
    @AfterSuite(alwaysRun = true)
    public void afterTest() throws SQLException {
        deleteTable();
    }
}
