package com.solvd.lperez.magento.desktop.pages;


import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CreateAccountSuccessPageBase.class)
public class CreateAccountSuccessPage extends CreateAccountSuccessPageBase {

    @FindBy(xpath = "//div[@role='alert']//div[normalize-space(text())]")
    ExtendedWebElement alertMessage;

    public CreateAccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAlertMessage() {
        return alertMessage.getText();
    }


}
