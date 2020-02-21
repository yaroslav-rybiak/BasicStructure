package tests.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTest {
    public WebDriver driver;
    public LoginPage loginPage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void methodLevelSetup() {
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}