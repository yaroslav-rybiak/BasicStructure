package tests.UI;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test()
    public void validLoginTest_ValidUserNameValidPassword() {
        mainPage
                .open()
                .clickSignInButton();

    }
}