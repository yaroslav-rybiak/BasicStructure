package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

abstract public class TestBase {

    protected static WebDriver driver;

    @BeforeSuite
    public void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void stop() {
        driver.quit();
        driver = null;
    }

    void takeScreenshot() {

        File theDir = new File("screenshots");

        if (!theDir.exists()) {

            try{
                theDir.mkdir();
            }
            catch(SecurityException se){
                System.out.println("An exception occured while creating folder. " + se.getCause());
            }
        }

        String timestamp  = new SimpleDateFormat("dd.MM_HH.mm.ss").format(Calendar.getInstance().getTime());
        try {
            Thread.sleep(500);
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File targetFile = new File("screenshots" + File.separator +"screenshot_" + timestamp + ".png");
            FileUtils.copyFile(screenshotFile, targetFile);
        }
        catch (Exception e) {
            System.out.println("An exception occured while taking screenshot. " + e.getCause());
        }
    }
}
