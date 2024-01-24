package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps"

)
public class Runner
{
    @AfterClass
    public static void cleanDriver()
    {
        BasePage.closeBrowser();
    }
}