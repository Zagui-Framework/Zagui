package zagui.utils.interactions;

import org.openqa.selenium.Alert;
import zagui.utils.waits.WaitHelper;

public interface AlertHandler extends WaitHelper, TextInputHandler {

    default void alertAccept() {
        waitToAlertIsPresent().accept();
    }

    default void alertDismiss() {
        waitToAlertIsPresent().dismiss();
    }

    default void alertPrompt(String prompt) {
        Alert alert = waitToAlertIsPresent();
        alert.sendKeys(prompt);
        alert.accept();
    }
}
