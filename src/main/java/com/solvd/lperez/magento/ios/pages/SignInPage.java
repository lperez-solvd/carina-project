package com.solvd.lperez.magento.ios.pages;


import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SignInPageBase.class)
public class SignInPage extends SignInPageBase implements IMobileUtils {

    @ExtendedFindBy(iosPredicate = "name == \"Email *\"")
    ExtendedWebElement emailInput;

    @ExtendedFindBy(iosPredicate = "name == \"Password * Password*\"")
    ExtendedWebElement passwordInput;

    @ExtendedFindBy(iosPredicate = "name == \"Sign In\"")
    ExtendedWebElement submitButton;
    @ExtendedFindBy(iosPredicate = "name == \"Password\" AND type == 'XCUIElementTypeStaticText'")
    ExtendedWebElement passwordLabel;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterEmail(String email) {
        emailInput.type(email);
    }

    @Override
    public void enterPassword(String pass) {
        tap(passwordLabel); // tap to hide keyboard
        passwordInput.type(pass);
    }

    @Override
    public SignInSuccessPageBase clickSubmitButton() {
        submitButton.click();
        return initPage(SignInSuccessPageBase.class);
    }
}
