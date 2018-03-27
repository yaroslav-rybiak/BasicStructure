package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FailedTest extends TestBase{

    @Test
    public void failTest() {
        driver.get("https://search.yahoo.com/");
        Assert.fail("This test is designed to fail.");
    }
}
