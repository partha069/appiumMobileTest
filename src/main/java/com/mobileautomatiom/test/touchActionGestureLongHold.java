package com.mobileautomatiom.test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class touchActionGestureLongHold extends base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities("real");
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        /**
         * Tap on Expandable Lists instead of performing clicking operation
         **/
        TouchAction t=new TouchAction(driver);
        WebElement expandableList =driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandableList))).perform();

        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();


        /**
         * Long Press
         */
        WebElement lp =driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(2))).release().perform();


        boolean ele=driver.findElementById("android:id/title").isDisplayed();
        System.out.println(ele + " is Displaying");
    }
}
