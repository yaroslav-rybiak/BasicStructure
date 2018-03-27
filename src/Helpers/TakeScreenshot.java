package Helpers;

import Tests.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenshot extends TestBase {

    static void screenShot(String methodName) throws IOException, InterruptedException
    {
        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
        File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("screenshots/" + methodName + " " + timestamp + ".png");
        FileUtils.copyFile(scr, dest);
    }
}
