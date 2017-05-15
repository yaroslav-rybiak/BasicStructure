package Pages;

import Misc.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage extends PageBase {

    public YandexPage(){
        URL = "https://www.yandex.com";
    }

    public void checkResult() {
        Assert.assertTrue(driver.getTitle().contains("results found"));
    }

    private WebElement searchField(WebDriver driver) {
        return driver.findElement(By.cssSelector("input[id=text]"));
    }

    public void search(String searchQuery) {
        searchField(driver).sendKeys(searchQuery);
        searchField(driver).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}