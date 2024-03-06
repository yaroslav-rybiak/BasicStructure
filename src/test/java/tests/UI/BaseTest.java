package tests.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.MainPage;

public class BaseTest {
    public WebDriver driver;
    public MainPage mainPage;
    public LoginPage loginPage;

    @BeforeClass
    public void classLevelSetup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        mainPage  = new MainPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}