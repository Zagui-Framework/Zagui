package zagui.utils.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import zagui.config.DriverConfig;
import zagui.utils.waits.WaitHelper;


public interface ClickHandler extends DriverConfig, WaitHelper {
    default void clickOn(By element) {
        waitToElementToBeClickable(element).click();
    }

    default void doubleClickOn(By element) {
        new Actions(driver).doubleClick(waitToElementToBeClickable(element)).perform();
    }
}
