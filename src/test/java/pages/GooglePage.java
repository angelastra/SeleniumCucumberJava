package pages;


public class GooglePage extends BasePage {

    //private String searchButtonn = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]";
    private String searchTextField = "//input[@title='Buscar']";
    private String firstResult= "//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3";
    private String lupita = "//*[@id='tsf']/div[1]/div[1]/div[2]/div[1]/button";

    public GooglePage(){
        super();
    }

    public void navigateToGoogle()
    {
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        submitElement(searchTextField);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return TextFromElement(firstResult);
    }

    public boolean LupitaActivada(){
        return elementIsEnable(lupita);
    }
}
