package zagui.utils.interactions;

import org.openqa.selenium.By;
import zagui.utils.waits.WaitHelper;

public interface TextInputHandler extends WaitHelper {
    default void typeOn(By element, String text) {
        waitToVisibilityOfElementLocated(element).clear();
        waitToVisibilityOfElementLocated(element).sendKeys(text);
    }
}
