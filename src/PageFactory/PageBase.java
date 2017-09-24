package PageFactory;

import Tests.TestBase;

abstract class PageBase extends TestBase {

    String URL;

    public void open() {
        driver.get(URL);
    }
}