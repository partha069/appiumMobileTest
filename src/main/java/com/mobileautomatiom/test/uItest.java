package com.mobileautomatiom.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;

public class uItest extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement>  driver = capabilities("real");
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Dey_Home");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
