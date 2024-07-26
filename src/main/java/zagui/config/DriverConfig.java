package zagui.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Creación de la instancia del WebDriver utilizando ChromeDriver.
 * Para usar otro navegador, cambie ChromeDriver() por el driver asociado al navegador de preferencia:
 * - ChromeDriver() para Google Chrome
 * - FirefoxDriver() para Mozilla Firefox
 * - SafariDriver() para Safari (en algunos casos)
 */
public interface DriverConfig {
    WebDriver driver = new ChromeDriver();

}


