package tests.UI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test()
    public void validLoginTest_ValidUserNameValidPassword() {
        mainPage
                .open()
                .clickSignInButton();

        loginPage
                .fillEmail("email")
                .fillPassword("password");
    }
}