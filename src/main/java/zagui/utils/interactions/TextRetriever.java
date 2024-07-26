package zagui.utils.interactions;

import zagui.config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import zagui.utils.waits.WaitHelper;

import java.util.List;


public interface TextRetriever extends WaitHelper, DriverConfig {
    default String getTextFromElement(By element) {
        return waitToVisibilityOfElementLocated(element).getText();
    }



    default List<String> getTextFromElements(By element) {
        return driver.findElements(element).stream().map(WebElement::getText).toList();
    }



}
