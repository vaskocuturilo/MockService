package info.testengineer.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;

import static info.testengineer.mock.MockDatabaseService.createTable;
import static info.testengineer.mock.MockDatabaseService.deleteTable;


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
    @BeforeSuite
    public void beforeTest() throws SQLException {
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
