package PageFactory;

import Tests.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class PageBase extends TestBase {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    String URL;

    public void open() {
        driver.get(URL);
    }
}