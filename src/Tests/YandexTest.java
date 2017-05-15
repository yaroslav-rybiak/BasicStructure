package Tests;

import Pages.YandexPage;
import org.junit.Test;

public class YandexTest extends YandexPage {

    private YandexPage yandexPage = new YandexPage();

    @Test
    public void yandexTest() {

        String searchQuery = "test";

        yandexPage.open();
        yandexPage.search(searchQuery);
        yandexPage.checkResult();

    }

}
