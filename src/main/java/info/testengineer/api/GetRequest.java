package info.testengineer.api;

import static io.restassured.RestAssured.given;

/**
 * The type GetRequest.
 */
public final class GetRequest {

    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Default constructor.
     */
    private GetRequest() {
    }

    /**
     * Gets minions from mock.
     *
     * @param url the url
     * @return the minions from mock
     */
    public static String getResponseFromMock(final String url) {
        final String json =
                given()
                        .then()
                        .statusCode(SUCCESS)
                        .log()
                        .all()
                        .when()
                        .get(url)
                        .getBody()
                        .asString();
        return json;
    }
}
