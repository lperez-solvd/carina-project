package com.solvd.lperez.magento.desktop.pages;

import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SignInSuccessPageBase.class)
public class SignInSuccessPage extends SignInSuccessPageBase {


    @FindBy(xpath = "//span[@class='logged-in']")
    ExtendedWebElement welcomeMessage;

    public SignInSuccessPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getWelcomeMessage() {

        return welcomeMessage.getText();

    }

}
