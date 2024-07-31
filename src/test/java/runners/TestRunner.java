package runners;


import hooks.TestHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:src/test/resources/reports/cucumber-reports"}

)
public class TestRunner implements TestHooks {

    @AfterClass
    public static void tearDown() {
        TestHooks.quidBrowser();
    }

}

