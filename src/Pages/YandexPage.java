package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage extends PageBase {

    public static void open() {
        YandexPage.setUrl("https://yandex.com/");
        driver.get(YandexPage.getUrl());
    }

    public static void checkResult() {
        Assert.assertTrue(driver.getTitle().contains("results found"));
    }

    private static WebElement searchField(WebDriver driver) {
        return driver.findElement(By.cssSelector("input[id=text]"));
    }


    public static void search(String searchQuery) {
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