package tests.UI;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Listeners.TestListener;

@Listeners({TestListener.class})
@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests extends BaseTest {

    //Test Data
    String correctUsername = "Luke";
    String correctPassword = "Skywalker";
    String wrongUsername = "Darth";
    String wrongPassword = "Vader";

    @Test()
    @Description("Login test with correct username and correct password.")
    @Story("Valid username and password login test")
    public void validLoginTest_ValidUserNameValidPassword() {
        loginPage
                .goToLoginPage()
                .login(correctUsername, correctPassword)
                .checkSuccess();
    }

    @Test()
    @Description(" Login test with wrong username and wrong password.")
    @Story("Invalid username and password login test")
    public void invalidLoginTest_InvalidUserNameInvalidPassword() {
        loginPage
                .goToLoginPage()
                .login(wrongUsername, wrongPassword)
                .checkError();
    }
}