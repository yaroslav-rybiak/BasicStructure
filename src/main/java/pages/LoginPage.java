package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    /**
     * Web Elements
     */
    @FindBy(xpath = "//span[@class='profileText']")
    WebElement signInForm;

    @FindBy(id = "email")
    public WebElement emailField;

    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
        URL = "https://www.cbc.ca/";
        PageFactory.initElements(driver, this);
    }

    /**
     * Page Methods
     */
    public LoginPage fillEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }
}