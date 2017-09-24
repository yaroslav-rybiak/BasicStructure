package Tests;

import PageFactory.YandexPage;
import org.testng.annotations.Test;

public class YandexTest extends TestBase {

    @Test
    public void yandexTest() {
        YandexPage yandexPage = new YandexPage(driver);
        yandexPage.open();
        yandexPage.search("lol");
        yandexPage.takeScreenshot();
    }
}
