package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends PageBase {

    public static void open() {
        url = "http://google.com/ncr";
        driver.get(url);
    }

    public static void checkResult(String searchQuery) {
        Assert.assertTrue(driver.getTitle().equals(searchQuery + " - Google Search"));
    }

    private static WebElement searchField(WebDriver driver) {
        return driver.findElement(By.id("lst-ib"));
    }


    public static void search(String searchQuery) {
        searchField(driver).sendKeys(searchQuery);
        searchField(driver).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(driver.getTitle());
    }

}