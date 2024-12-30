package com.solvd.lperez.magento.desktop.pages;

import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CreateAccountPageBase.class)
public class CreateAccountPage extends CreateAccountPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountPage.class);


    @FindBy(xpath = "//input[@name='firstname']")
    ExtendedWebElement nameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    ExtendedWebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    ExtendedWebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    ExtendedWebElement passwordConfirmation;

    @FindBy(xpath = "//button[@title='Create an Account']")
    ExtendedWebElement submitButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }


    /*
     * Send text to inputs
     *
     * */
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

        LOGGER.debug("The email I'm using is: {}", email);
        emailInput.type(email);
    }

    @Override
    public void enterPass(String password) {
        passwordInput.type(password);
        passwordConfirmation.type(password);
    }

    @Override
    public CreateAccountSuccessPage clickSubmitButton() {
        submitButton.click();
        return new CreateAccountSuccessPage(getDriver());
    }


}
