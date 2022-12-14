package com.amazon.pages;

import com.amazon.step_definitions.Initialize;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePages {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;


    public BasePages(){
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,10);
    }

    public MobileElement waitUntil(MobileElement element){
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
    }


    @FindBy(xpath = "//*[@text='Get started']")
    public MobileElement getStarted;

    @FindBy(id = "com.etsy.android:id/menu_bottom_nav_home")
    public MobileElement homeBtn;

    @FindBy(id = "com.etsy.android:id/dark_mode_alert_dismiss")
    public MobileElement dark;

}



