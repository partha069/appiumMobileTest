package com.mobileautomatiom.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base {

    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        File appDir = new File("src");
        File app = new File(appDir, "ApiDemos-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (device.equals("emulator")) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "partha7");
        } else if (device.equals("real")) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MI MAX");
        }
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
