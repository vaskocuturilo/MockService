package info.testengineer.data;

import org.testng.annotations.DataProvider;

/**
 * The type Data providers.
 */
public final class DataProviders {

    /**
     * The private constructor.
     */
    private DataProviders() {
    }

    /**
     * Correct Login object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "correctLogin")
    public static Object[][] correctLogin() {
        return new Object[][]{
                {"admin", "admin"}
        };
    }

    /**
     * In correct login object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "incorrectLogin")
    public static Object[][] incorrectLogin() {
        return new Object[][]{
                {"admin", "test"},
                {"@@@@@@", "########"},
                {"3245235", "23523626"}
        };
    }


    /**
     * User data for adoption object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "userDataForAdoption")
    public static Object[][] userDataForAdoption() {
        return new Object[][]{
                {"Anton Smirnov", "Hello world Street", "12345", "test@test.com"}
        };
    }
}
