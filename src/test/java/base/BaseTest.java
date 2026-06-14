package base;

import drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        DriverManager.initializeDriver();
    }

    @AfterMethod
    public void teardown() {

        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}