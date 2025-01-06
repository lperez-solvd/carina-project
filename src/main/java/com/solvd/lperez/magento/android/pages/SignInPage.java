package com.solvd.lperez.magento.android.pages;


import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageBase.class)
public class SignInPage extends SignInPageBase {

    @FindBy(xpath = "//android.view.View[@text=\"Registered Customers\"]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
    ExtendedWebElement emailInput;

    @FindBy(xpath = "//android.view.View[@text=\"Registered Customers\"]/android.view.View/android.view.View/android.widget.EditText")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.widget.Button[@text=\"Sign In\"]")
    ExtendedWebElement submitButton;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterEmail(String email) {
        emailInput.type(email);
    }

    @Override
    public void enterPassword(String pass) {
        passwordInput.type(pass);
    }

    @Override
    public SignInSuccessPageBase clickSubmitButton() {
        submitButton.click();
        return initPage(SignInSuccessPageBase.class);
    }
}
