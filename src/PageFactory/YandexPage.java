package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexPage extends PageBase {

    //constructor
    public YandexPage(WebDriver driver){
        URL = "https://ya.ru/";
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="text")
    private WebElement searchField;

    public void search(String query) {
        searchField.clear();
        searchField.sendKeys(query);
        searchField.sendKeys(Keys.ENTER);
    }
}
