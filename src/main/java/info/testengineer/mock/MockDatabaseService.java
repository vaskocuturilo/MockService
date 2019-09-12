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
public class MockDatabaseService {


    private static final String DATABASE_DRIVER = "org.h2.Driver";
    private static final String DATABASE_CONNECTION = "jdbc:h2:tcp://localhost/~/test";
    private static final String DATABASE_USER = "sa";
    private static final String DATABASE_PASSWORD = "qatester";

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(MockDatabaseService.class.getName());

    /**
     * Default constructor.
     */
    public MockDatabaseService() {
        super();
        //empty
        return;
    }

    /**
     * Create table.
     */
    public static void createTable() throws SQLException {

        final String absPath = new File("src/main/resources/create.sql").getAbsolutePath();

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
     */
    public static void deleteTable() throws SQLException {
        final String absPath = new File("src/main/resources/drop.sql").getAbsolutePath();

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
            Class.forName(DATABASE_DRIVER);
        } catch (ClassNotFoundException ex) {
            LOG.info(ex.toString());
        }
        try {
            h2DBConnection = DriverManager.getConnection(DATABASE_CONNECTION, DATABASE_USER, DATABASE_PASSWORD);

            return h2DBConnection;
        } catch (SQLException ex) {
            LOG.info(ex.toString());
        }

        return h2DBConnection;
    }
}
