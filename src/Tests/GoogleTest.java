package Tests;

import Pages.GooglePage;
import org.junit.Test;

public class GoogleTest extends GooglePage {

    @Test
    public void googleTest() {

        String searchQuery = "test";

        GooglePage.open();
        GooglePage.search(searchQuery);
        GooglePage.checkResult(searchQuery);

    }

}
