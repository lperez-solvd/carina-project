package com.solvd.lperez.magento.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInSuccessPage extends AbstractPage {


    @FindBy(xpath = "//span[@class='logged-in']")
    ExtendedWebElement welcomeMessage;

    public SignInSuccessPage(WebDriver driver) {
        super(driver);
    }


    public String getWelcomeMessage() {

        return welcomeMessage.getText();

    }

}
