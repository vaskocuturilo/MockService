package info.testengineer.web;

import info.testengineer.base.BaseWeb;
import info.testengineer.data.DataProviders;
import info.testengineer.listener.LogListener;
import info.testengineer.pages.LoginPage;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class WebTest extends BaseWeb {

    @Test(dataProvider = "correctLogin", dataProviderClass = DataProviders.class)
    @Story("Check authorization with correct data.")
    public void testAuthorizationWithCorrectData(String userLogin, String userPassword) {
        new LoginPage()
                .enterCredentialAndLogin(userLogin, userPassword)
                .assertProfile();
    }

    @Test(dataProvider = "inCorrectLogin", dataProviderClass = DataProviders.class)
    @Story("Check authorization with incorrect data.")
    public void testAuthorizationWithInCorrectData(String userLogin, String userPassword) {
        new LoginPage()
                .enterCredentialAndLogin(userLogin, userPassword)
                .checkErrorMessage();
    }
}
