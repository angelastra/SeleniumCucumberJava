package pages;

public class TablePage extends BasePage {

    private String tableLocator = "/html/body/div/div";

    
    public TablePage(){
        super(driver);
    }

    public void navigateToTable(String url){
        navigateTo(url);
    }

    public String getValue(int row, int column)
    {
        return getValueFromTable(tableLocator, row, column);
    }

    public void setValue(int row,int column, String textToSend)
    {
        setValueToTable(tableLocator, row, column, textToSend);
    }
}
