package com.solvd.lperez.magento.ios.pages;

import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CreateAccountPageBase.class)
public class CreateAccountPage extends CreateAccountPageBase implements IMobileUtils {

    @ExtendedFindBy(iosPredicate = "name == 'First Name *'")
    ExtendedWebElement nameInput;

    @ExtendedFindBy(iosPredicate = "name == 'Last Name *'")
    ExtendedWebElement lastNameInput;

    @ExtendedFindBy(iosPredicate = "name == 'Email *'")
    ExtendedWebElement emailInput;

    @ExtendedFindBy(iosPredicate = "name == 'Password *'")
    ExtendedWebElement passwordInput;

    @ExtendedFindBy(iosPredicate = "name == 'Confirm Password *'")
    ExtendedWebElement passwordConfirmation;

    @ExtendedFindBy(iosPredicate = "name == \"Create an Account\"")
    ExtendedWebElement submitButton;
    @ExtendedFindBy (iosPredicate = "name == \"Not Now\"")
    ExtendedWebElement notNowButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterName(String name) {
        nameInput.type(name);
    }

    @Override
    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    @Override
    public void enterEmail(String email) {
        swipe(emailInput);
        emailInput.type(email);
    }

    @Override
    public void enterPass(String password) {
        passwordInput.type(password);
        waitUntil(d -> notNowButton.isElementPresent(),10);
        notNowButton.click();
        swipe(passwordConfirmation);
        passwordConfirmation.type(password);
    }

    @Override
    public CreateAccountSuccessPageBase clickSubmitButton() {
        swipe(submitButton);
        submitButton.click();
        return initPage(CreateAccountSuccessPageBase.class);
    }


}
