package com.solvd.lperez.magento.desktop.pages;

import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SignInPageBase.class)
public class SignInPage extends SignInPageBase {

    @FindBy(xpath = "//input[@id='email']")
    ExtendedWebElement emailInput;

    @FindBy(xpath = "//input[@title='Password']")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "//button[@name='send'][1]")
    ExtendedWebElement submitButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterEmail(String email) {
        emailInput.type(email);
    }

    @Override
    public void enterPassword(String pass) {
        passwordInput.type(pass);
    }

    @Override
    public SignInSuccessPage clickSubmitButton() {
        submitButton.click();
        return new SignInSuccessPage(driver);
    }


}
