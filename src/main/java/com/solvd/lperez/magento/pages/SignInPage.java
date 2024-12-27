package com.solvd.lperez.magento.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='email']")
    ExtendedWebElement emailInput;

    @FindBy(xpath = "//input[@title='Password']")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "//button[@name='send'][1]")
    ExtendedWebElement submitButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }


    public void enterEmail(String email) {
        emailInput.type(email);
    }

    public void enterPassword(String pass) {
        passwordInput.type(pass);
    }

    public SignInSuccessPage clickSubmitButton() {
        submitButton.click();
        return new SignInSuccessPage(driver);
    }


}
