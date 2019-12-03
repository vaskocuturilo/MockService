package info.testengineer.web;

import info.testengineer.data.DataProviders;
import info.testengineer.pages.*;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class WebTest extends AbstractPage {

    @Test(dataProvider = "correctLogin", dataProviderClass = DataProviders.class)
    @Story("Check authorization with correct data.")
    public void testAuthorizationWithCorrectData(String userLogin, String userPassword) {
        openPage("login.html");
        new LoginPage()
                .enterCredentialAndLogin(userLogin, userPassword)
                .assertProfile();
    }

    @Test(dataProvider = "incorrectLogin", dataProviderClass = DataProviders.class)
    @Story("Check authorization with incorrect data.")
    public void testAuthorizationWithIncorrectData(String userLogin, String userPassword) {
        openPage("login.html");
        new LoginPage()
                .enterCredentialAndLogin(userLogin, userPassword)
                .checkErrorMessage();
    }

    @Test(dataProvider = "userDataForAdoption", dataProviderClass = DataProviders.class)
    @Story("Check pass adoption.")
    public void testCheckPassAdoption(String name, String address, String postCode, String email) {
        openPage("testing.html");
        new TestingPage()
                .selectSortBy(StartDate.TODAY)
                .selectAdoptionPass()
                .addAdoptionData(name, address, postCode, email);
    }


    @Test
    @Story("Check fail adoption.")
    public void testCheckFailAdoption() {
        openPage("testing.html");
        new TestingPage()
                .selectSortBy(StartDate.TOMORROW)
                .selectAdoptionFail()
                .checkAdoptionFail();
    }

    @Test
    @Story("Check contact form.")
    public void testContactForm() {
        openPage("contact.html");
        new ContactPage()
                .addContactInformation("userData")
                .selectContactType(Buttons.INFORMATION)
                .checkedInformationType(InformationType.VOLUNTEER)
                .sendMessage()
                .checkThatMessageSentDone();
    }

}
