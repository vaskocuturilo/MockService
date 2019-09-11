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
    @DataProvider(name = "inCorrectLogin")
    public static Object[][] inCorrectLogin() {
        return new Object[][]{
                {"admin", "test"},
                {"@@@@@@", "########"},
                {"3245235", "23523626"}
        };
    }


}
