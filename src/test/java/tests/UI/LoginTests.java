package tests.UI;

import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test()
    public void validLoginTest_ValidUserNameValidPassword() {
        loginPage
                .goToLoginPage();
//                .login(correctUsername, correctPassword)
//                .checkSuccess();
    }

    @Test()
    public void invalidLoginTest_InvalidUserNameInvalidPassword() {
        loginPage
                .goToLoginPage();
//                .login(wrongUsername, wrongPassword)
//                .checkError();
    }
}