package com.solvd.lperez.magento;


import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CreateAccountSuccessPage extends AbstractPage {

    @FindBy(xpath = "//div[@role='alert']//div[normalize-space(text())]")
    ExtendedWebElement alertMessage;

    public CreateAccountSuccessPage(WebDriver driver) {
        super(driver);
    }


    public String getAlertMessage() {


        return alertMessage.getText();
    }


}
