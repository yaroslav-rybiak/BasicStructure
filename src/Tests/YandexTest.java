package Tests;

import Pages.YandexPage;
import org.junit.Test;

public class YandexTest extends YandexPage {

    @Test
    public void yandexTest() {

        String searchQuery = "test";

        YandexPage.open();
        YandexPage.search(searchQuery);
        YandexPage.checkResult();

    }

}
