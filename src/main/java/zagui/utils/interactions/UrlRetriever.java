package zagui.utils.interactions;

import zagui.config.DriverConfig;

public interface UrlRetriever extends DriverConfig {

    default String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
