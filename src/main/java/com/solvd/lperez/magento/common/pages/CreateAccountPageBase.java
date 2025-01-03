package com.solvd.lperez.magento.common.pages;

import com.solvd.lperez.magento.desktop.pages.CreateAccountSuccessPage;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CreateAccountPageBase extends AbstractPage {
    public CreateAccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void enterName(String name);

    public abstract void enterLastName(String lastName);

    public abstract void enterEmail(String email);

    public abstract void enterPass(String password);

    public abstract CreateAccountSuccessPageBase clickSubmitButton();

}
