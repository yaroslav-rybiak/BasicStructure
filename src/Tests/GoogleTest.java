package Tests;

import PageFactory.GooglePage;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase{

    @Test
    public void googleTest() {
        GooglePage googlePage = new GooglePage(driver);
        googlePage.open();
        googlePage.search("lol");
        googlePage.takeScreenshot();
    }

}
