package hooks;

import zagui.config.DriverConfig;


public interface TestHooks extends DriverConfig {
    default void setUp(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    static void quidBrowser() {
        driver.quit();
    }

    static void closeBrowser() {
        driver.close();
    }


}
