package info.testengineer.mock;

import org.h2.tools.RunScript;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * The type Mock database service.
 */
public final class MockDatabaseService {

    /**
     * The constant BASE_DRIVER.
     */
    private static final String BASE_DRIVER = "org.h2.Driver";

    /**
     * The constant BASE_CONN.
     */
    private static final String BASE_CONN = "jdbc:h2:tcp://localhost/~/test";

    /**
     * The constant BASE_USER.
     */
    private static final String BASE_USER = "sa";

    /**
     * The constant BASE_PASS.
     */
    private static final String BASE_PASS = "qatester";

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(MockDatabaseService.class.getName());

    /**
     * Default constructor.
     */
    private MockDatabaseService() {
        super();
        //empty
        return;
    }

    /**
     * Create table.
     *
     * @throws SQLException for method.
     */
    public static void createTable() throws SQLException {

        final String absPath = new File("src/main/resources/createData.sql").getAbsolutePath();

        final Connection connection = getDBConnection();

        try {
            connection.setAutoCommit(false);

            RunScript.execute(connection, new FileReader(absPath));

            connection.commit();


        } catch (SQLException | IOException ex) {
            LOG.info(ex.toString());
        } finally {
            connection.close();
        }

        LOG.info("Successfully Created WORKERS Table!");
    }

    /**
     * Delete table.
     *
     * @throws SQLException for method.
     */
    public static void deleteTable() throws SQLException {
        final String absPath = new File("src/main/resources/dropData.sql").getAbsolutePath();

        final Connection connection = getDBConnection();

        try {
            connection.setAutoCommit(false);

            RunScript.execute(connection, new FileReader(absPath));

            connection.commit();


        } catch (SQLException | IOException ex) {
            LOG.info(ex.toString());
        } finally {
            connection.close();
        }

        LOG.info("Successfully delete WORKERS Table!");
    }

    /**
     * Get db connection.
     *
     * @return the db connection
     */
    private static Connection getDBConnection() {

        Connection h2DBConnection = null;

        try {
            Class.forName(BASE_DRIVER);
        } catch (ClassNotFoundException ex) {
            LOG.info(ex.toString());
        }
        try {
            h2DBConnection = DriverManager.getConnection(BASE_CONN, BASE_USER, BASE_PASS);

            return h2DBConnection;
        } catch (SQLException ex) {
            LOG.info(ex.toString());
        }

        return h2DBConnection;
    }
}
