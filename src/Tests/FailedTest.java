package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FailedTest extends TestBase{

    @Test
    public void fail() {
        driver.get("https://www.yahoo.com/");
        Assert.fail("This test is designed to fail.");
    }
}
