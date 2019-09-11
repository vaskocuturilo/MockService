package info.testengineer.mock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static info.testengineer.base.BaseApi.HTTP_PORT;

/**
 * The type Mock service.
 */
public class MockService {

    /**
     * The constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Default constructor.
     */
    public MockService() {
        super();
        //empty
        return;
    }

    /**
     * Start mock service.
     */
    public void startMockService() {
        configureFor("localhost", HTTP_PORT);
        stubFor(get(urlPathMatching("/minions"))
                .willReturn(aResponse()
                        .withStatus(SUCCESS)
                        .withHeader("Content-Type", "application/json")
                        .withBody("WireMock")));

    }
}
