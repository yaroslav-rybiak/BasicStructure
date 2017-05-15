package Pages;

import Tests.TestBase;

class PageBase extends TestBase {

    private static String url;

    static void setUrl(String _url) {
        url = _url;
    }

    static String getUrl() {
        return url;
    }

    public static void open() {
        driver.get(url);
    }

}