package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GooglePage extends PageBase {
    //constructor
    public GooglePage(WebDriver driver){
        URL = "https://www.google.com/ncr";
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="q")
    private WebElement searchField;

    public void search(String query) {
        searchField.clear();
        searchField.sendKeys(query);
        searchField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
    }
}