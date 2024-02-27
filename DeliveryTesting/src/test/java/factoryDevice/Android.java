package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.GetProperties;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice {
    private static AppiumDriver driver;

    public AppiumDriver create() {
        if (driver == null) {
            DesiredCapabilities config = getDesiredCapabilities();

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), config);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    private static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName", GetProperties.getProperties().getDeviceName());
        config.setCapability("platformVersion", GetProperties.getProperties().getPlatformVersion());
        config.setCapability("appPackage", GetProperties.getProperties().getAppPackage());
        config.setCapability("appActivity", GetProperties.getProperties().getAppActivity());
        config.setCapability("platformName", "Android");
        config.setCapability("automationName", "uiautomator2");
        return config;
    }

    public void closeSession() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
