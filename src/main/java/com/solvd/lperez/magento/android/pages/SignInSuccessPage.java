package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInSuccessPageBase.class)
public class SignInSuccessPage extends SignInSuccessPageBase {


    @FindBy(xpath = "//android.view.View[@text=\"Welcome, Lucas Perez!\"]")
    ExtendedWebElement welcomeMessage;
    @FindBy(xpath = "//android.webkit.WebView[@text='Home Page']/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]")
    ExtendedWebElement hamburguerNav;
    @FindBy(xpath = "//android.widget.TextView[@text='Account']")
    ExtendedWebElement accountSection;

    public SignInSuccessPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public String getWelcomeMessage() {
        hamburguerNav.click();
        waitUntil(driver -> accountSection.isElementPresent(), 10);
        accountSection.click();
        pause(1);
        return welcomeMessage.getText();

    }
}
