package pages;

import zagui.utils.interactions.ClickHandler;
import zagui.utils.interactions.TextRetriever;
import zagui.utils.interactions.UrlRetriever;
import zagui.utils.interactions.TextInputHandler;
import org.openqa.selenium.By;


public class ExamplePage implements ClickHandler, TextInputHandler, UrlRetriever, TextRetriever {

    By userInput = By.id("user-name");
    By passwordInput = By.id("password");
    By btnLogin = By.id("login-button");
    By messageErrorLocator = By.xpath("//h3[@data-test='error']");

    public void enterUser(String user) {
        typeOn(userInput, user);
    }

    public void enterPassword(String password) {
        typeOn(passwordInput, password);
    }

    public void clickBtnLogin() {
        clickOn(btnLogin);
    }

    public String getUrl() {
        return getCurrentUrl();
    }

    public String getMessageError() {
        return getTextFromElement(messageErrorLocator);
    }

}
