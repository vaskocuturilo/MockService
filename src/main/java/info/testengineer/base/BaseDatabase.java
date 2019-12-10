package info.testengineer.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

import static info.testengineer.mock.MockDatabaseService.*;


/**
 * The class Base database.
 */
public class BaseDatabase {

    /**
     * The private static value EntityManagerFactory.
     */
    private static EntityManagerFactory managerFactory;

    /**
     * The private static value EntityManager.
     */
    private static EntityManager entityManager;

    /**
     * Default constructor.
     */
    public BaseDatabase() {
        super();
        //empty
        return;
    }

    /**
     * The method .
     */
    @BeforeClass
    public static void initDBUnitExecution() {
        managerFactory = Persistence.createEntityManagerFactory("DBUnitExecution");
        entityManager = managerFactory.createEntityManager();

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
        entityManager.clear();
        entityManager.close();
        managerFactory.close();
    }
}
