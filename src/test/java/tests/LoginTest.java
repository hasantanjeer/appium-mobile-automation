package tests;

import base.BaseTest;
import drivers.DriverManager;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogin() {

        LoginPage loginPage =
                new LoginPage(DriverManager.getDriver());

        loginPage.login(
                "admin",
                "password123");
    }
}