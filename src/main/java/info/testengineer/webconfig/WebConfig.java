package info.testengineer.webconfig;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

/**
 * The interface Web config.
 */
@Config.Sources({"classpath:${env}.properties"})
public interface WebConfig extends Config {

    /**
     * Value BASE_CONFIG.
     */
    WebConfig BASE_CONFIG = ConfigFactory.create(WebConfig.class, System.getenv(), System.getProperties());

    /**
     * Value web.url.
     *
     * @return url. url
     */
    @Key("web.url")
    String getWebUrl();

    /**
     * Value api.url.
     *
     * @return url. url
     */
    @Key("api.url")
    String getApiUrl();

}
