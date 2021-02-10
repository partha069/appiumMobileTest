package com.mobileautomatiom.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;

public class UIAutomatorTest extends base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement>  driver = capabilities("real");
        // driver.findElementByAndroidUIAutomator("attribute("value")")

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

    }
}
