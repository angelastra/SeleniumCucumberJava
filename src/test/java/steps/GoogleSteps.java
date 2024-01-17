package steps;

import org.junit.Assert;
import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

   GooglePage google= new GooglePage();

   @Given("navego a Google")
   public void navigateToGoogle()
   {
      google.navigateToGoogle();
   }

   @When("^busco (.+)$")
   public void enterSearchCriteria(String algo){
      google.enterSearchCriteria(algo);
   } 

   @And("^click en boton de busqueda$")
   public void clickSearchButton()
   {
      google.clickGoogleSearch();
   }

   @Then("^obtengo resultados de (.+)$")
   public void validateResults(String algo)
   {
      Assert.assertEquals(algo + " - Wikipedia, la enciclopedia libre", google.firstResult());
     //Assert.assertFalse("Si está habilitada la lupita",google.LupitaActivada());
   } 
}
