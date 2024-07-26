package zagui.utils.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import zagui.config.DriverConfig;
import zagui.utils.waits.WaitHelper;


public interface DragAndDropHandler extends DriverConfig, WaitHelper {
    default void dragAndDropOnElement(By elementDraggable, By elementDroppable) {
        WebElement draggable = waitToVisibilityOfElementLocated(elementDraggable);
        WebElement droppable = waitToVisibilityOfElementLocated(elementDroppable);
        new Actions(driver).dragAndDrop(draggable, droppable).perform();

    }
}
