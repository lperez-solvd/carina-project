package com.solvd.lperez.magento.ios.pages;

import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CreateAccountSuccessPageBase.class)
public class CreateAccountSuccessPage extends CreateAccountSuccessPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"alert\"`]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    ExtendedWebElement alertMessage;

    public CreateAccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAlertMessage() {
        return alertMessage.getText();
    }
}
