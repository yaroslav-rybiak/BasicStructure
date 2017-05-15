package Misc;

import Tests.GoogleTest;
import Tests.YandexTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        GoogleTest.class,
        YandexTest.class,
})
public class AllTests {

}