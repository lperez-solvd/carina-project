package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateAccountSuccessPageBase.class)
public class CreateAccountSuccessPage extends CreateAccountSuccessPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Thank you for registering with Main Website Store.']")
    ExtendedWebElement alertMessage;

    public CreateAccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAlertMessage() {
        return alertMessage.getText();
    }
}
