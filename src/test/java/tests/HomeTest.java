package tests;

import base.BaseTest;
import drivers.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void verifyHomePageLoaded() {

        HomePage homePage =
                new HomePage(DriverManager.getDriver());

        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed"
        );
    }
}