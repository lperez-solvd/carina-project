package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.solvd.lperez.magento.desktop.pages.CreateAccountSuccessPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateAccountPageBase.class)
public class CreateAccountPage extends CreateAccountPageBase implements IMobileUtils {

    @FindBy(xpath = "(//android.view.View[@text='Personal Information'])[1]/android.view.View[3]/android.widget.EditText")
    ExtendedWebElement nameInput;

    @FindBy(xpath = "/(//android.view.View[@text='Personal Information'])[1]/android.view.View[5]/android.widget.EditText")
    ExtendedWebElement lastNameInput;

    @FindBy(xpath = "(//android.view.View[@text='Sign-in Information'])[1]/android.view.View[3]/android.widget.EditText")
    ExtendedWebElement emailInput;

    @FindBy(xpath = "(//android.view.View[@text='Sign-in Information'])[1]/android.widget.EditText")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "(//android.view.View[@text='Sign-in Information'])[1]/android.view.View[7]/android.widget.EditText")
    ExtendedWebElement passwordConfirmation;

    @FindBy(xpath = "//android.widget.Button[@text='Create an Account']")
    ExtendedWebElement submitButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterName(String name) {
        nameInput.type(name);
    }

    @Override
    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    @Override
    public void enterEmail(String email) {

        emailInput.type(email);
    }

    @Override
    public void enterPass(String password) {
        passwordInput.type(password);
        passwordConfirmation.type(password);
    }

    @Override
    public CreateAccountSuccessPageBase clickSubmitButton() {
        swipe(submitButton);
        submitButton.click();
        return initPage(CreateAccountSuccessPageBase.class);
    }


}
