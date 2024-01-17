package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.TablePage;

public class TableSteps {
    TablePage tablePage = new TablePage();

    @Given("The url of the table")
    public void navigateToURLTable()
    {
        tablePage.navigateToTable("https://1v2njkypo4.csb.app/");
    }

    @Then("I get a value from the table")
    public void getValueFromTable(){
        String values = tablePage.getValue(3,3);
        Assert.assertEquals("r: 2, c: 2", values);
    }
}
