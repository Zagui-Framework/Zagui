package zagui.utils.waits;

import org.openqa.selenium.Alert;
import zagui.config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface WaitHelper extends DriverConfig {

    Logger logger = LogManager.getLogger(WaitHelper.class);
    int DEFAULT_TIMEOUT_SECONDS = 5;

    private WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT_SECONDS));
    }

    private <T> T waitFor(ExpectedCondition<T> condition, By locator) {
        try {
            return getWait().until(condition);
        } catch (TimeoutException error) {
            logger.error("Timeout waiting for element: {}", locator, error);
            throw new TimeoutException("Element not found: " + locator, error);
        }
    }

    default WebElement waitToVisibilityOfElementLocated(By locator) {
        return waitFor(ExpectedConditions.visibilityOfElementLocated(locator), locator);
    }

    default WebElement waitToElementToBeClickable(By locator) {
        return waitFor(ExpectedConditions.elementToBeClickable(locator), locator);
    }

    default Alert waitToAlertIsPresent() {
        return getWait().until(ExpectedConditions.alertIsPresent());
    }

}
