package Helpers;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.IOException;

import static Helpers.TakeScreenshot.screenShot;

public class ScreenshotListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName = result.getName();
        if (!result.isSuccess()) {
            try {
                screenShot(methodName);
            }
            catch (IOException|InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}