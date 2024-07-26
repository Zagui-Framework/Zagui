package zagui.utils.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import zagui.utils.waits.WaitHelper;

import java.util.List;

public interface DropdownHandler extends WaitHelper {

    private Select select(By element) {
        return new Select(waitToVisibilityOfElementLocated(element));
    }

    default void selectByIndex(By element, int index) {
        select(element).selectByIndex(index);
    }

    default void selectByName(By element, String value) {
        select(element).selectByValue(value);
    }

    default void selectByVisibleText(By element , String text){
        select(element).selectByVisibleText(text);
    }

    default List<String> getSelectOptions(By element) {
        return select(element).getOptions().stream().map(WebElement::getText).toList();
    }


    default void deselectByIndex(By element, int index) {
        select(element).deselectByIndex(index);
    }

    default void deselectByName(By element, String value) {
        select(element).deselectByValue(value);
    }

}
