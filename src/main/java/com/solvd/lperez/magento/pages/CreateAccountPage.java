package com.solvd.lperez.magento.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAccountPage extends AbstractPage {

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
    public void enterName(String name) {
        nameInput.type(name);
    }

    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    public void enterEmail(String email) {

        LOGGER.debug("The email I'm using is: {}", email);
        emailInput.type(email);
    }

    public void enterPass(String password) {
        passwordInput.type(password);
        passwordConfirmation.type(password);
    }

    public CreateAccountSuccessPage clickSubmitButton() {
        submitButton.click();
        return new CreateAccountSuccessPage(getDriver());
    }


}
