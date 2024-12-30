package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInSuccessPageBase.class)
public class SignInSuccessPage extends SignInSuccessPageBase {


    @FindBy(xpath = "//span[@class='logged-in']")
    ExtendedWebElement welcomeMessage;

    public SignInSuccessPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public String getWelcomeMessage() {

        return welcomeMessage.getText();

    }
}
