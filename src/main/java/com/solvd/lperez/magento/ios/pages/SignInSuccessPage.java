package com.solvd.lperez.magento.ios.pages;

import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SignInSuccessPageBase.class)
public class SignInSuccessPage extends SignInSuccessPageBase {


    @FindBy(xpath = "//android.view.View[@text=\"Welcome, Lucas Perez!\"]")
    ExtendedWebElement welcomeMessage;
    @ExtendedFindBy(iosPredicate = "name == \"\uE609\"")
    ExtendedWebElement hamburguerNav;
    @ExtendedFindBy(iosPredicate = "name = 'Account'")
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
