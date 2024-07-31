package steps;

import hooks.TestHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExamplePage;
import zagui.config.Constants;


import static org.junit.Assert.assertEquals;

public class ExampleStepDefinitions implements TestHooks {

    String urlLoginPage = Constants.LOGIN_PAGE.getConstants();
    String urlInventoryPage = Constants.INVENTORY_PAGE.getConstants();

    ExamplePage examplePage = new ExamplePage();

    @Given("I am on the login page")
    public void IAmOnTheLoginPage() {
        setUp(urlLoginPage);
    }

    @When("I enter {} as the username")
    public void iEnterAsTheUsername(String user) {
        examplePage.enterUser(user);
    }

    @And("I enter {} as the password")
    public void iEnterAsThePassword(String password) {
        examplePage.enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        examplePage.clickBtnLogin();
    }

    @Then("I should be on the inventory page")
    public void iShouldBeOnTheInventoryPage() {
        String expectedUrl = urlInventoryPage;
        String currentUrl = examplePage.getUrl();
        assertEquals(expectedUrl, currentUrl);
    }

    @Then("I should see an error {}")
    public void iShouldSeeAnErrorMessage(String message) {
        String currentMessage = examplePage.getMessageError();
        assertEquals(message, currentMessage);
    }
}

