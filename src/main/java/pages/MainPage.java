package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

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
    public MainPage(WebDriver driver) {
        super(driver);
        URL = "https://www.cbc.ca/";
        PageFactory.initElements(driver, this);
    }

    /**
     * Page Methods
     */
    public MainPage open() {
        open(URL);
        return this;
    }

    public void clickSignInButton() {
        signInForm.click();
        waitVisibility(emailField);
    }
}