package com.amazon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePages{


    @FindBy(id = "com.etsy.android:id/edit_username")
    public MobileElement userNameInput;

    @FindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordInput;

    @FindBy(id = "com.etsy.android:id/button_signin")
    public MobileElement signIn;


}
