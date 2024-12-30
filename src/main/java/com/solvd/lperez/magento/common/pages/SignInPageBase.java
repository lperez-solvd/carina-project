package com.solvd.lperez.magento.common.pages;

import com.solvd.lperez.magento.desktop.pages.SignInSuccessPage;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignInPageBase extends AbstractPage {
    public SignInPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void enterEmail(String email);

    public abstract void enterPassword(String pass);

    public abstract SignInSuccessPage clickSubmitButton();
}
