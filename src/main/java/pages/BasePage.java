package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public String URL;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    //Open Method
    public void open(String URL) {
        driver.get(URL);
    }

    //Click Method
    public void click(WebElement element) {
        element.click();
    }

    //Write Text
    public void writeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    //Read Text
    public String readText(WebElement element) {
        return element.getText();
    }

    //Wait
    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}