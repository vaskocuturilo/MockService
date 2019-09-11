package info.testengineer.api;

import info.testengineer.base.BaseApi;
import info.testengineer.listener.LogListener;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static info.testengineer.api.GetRequest.getResponseFromMock;
import static org.testng.AssertJUnit.assertEquals;

@Listeners(LogListener.class)
public class ApiTest extends BaseApi {

    private static final String MINIONS = "/minions";

    @Test
    @Story("Check dara response from mock service.")
    public void testRequestInMinions() {
        final String resultApiJson = getResponseFromMock(MINIONS);
        assertEquals(resultApiJson, "WireMock");
    }
}
