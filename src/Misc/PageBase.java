package Misc;

public class PageBase extends TestBase {

    protected String URL;

    public void open(){
        driver.get(URL);
    }

}