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
 * The type Base database.
 */
public class BaseDatabase {

    protected static EntityManagerFactory emf;
    protected static EntityManager em;

    /**
     * Default constructor.
     */
    public BaseDatabase() {
        super();
        //empty
        return;
    }

    @BeforeClass
    public static void init() {
        emf = Persistence.createEntityManagerFactory("DBUnitExecution");
        em = emf.createEntityManager();

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
        em.clear();
        em.close();
        emf.close();
    }
}
