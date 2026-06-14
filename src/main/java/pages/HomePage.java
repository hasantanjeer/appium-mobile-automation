package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By homeTitle = By.id("home_title");

    public boolean isHomePageDisplayed() {
        return driver.findElement(homeTitle).isDisplayed();
    }
}