package drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver initializeDriver() {

        try {

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("deviceName", "Android Emulator");

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    caps);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}