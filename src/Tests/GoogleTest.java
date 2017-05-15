package Tests;

import Pages.GooglePage;
import org.junit.Test;

public class GoogleTest extends GooglePage {

    private GooglePage googlePage = new GooglePage();

    @Test
    public void googleTest() {

        String searchQuery = "test";

        googlePage.open();
        googlePage.search(searchQuery);
        googlePage.checkResult(searchQuery);
    }
}
