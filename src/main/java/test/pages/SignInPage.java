package test.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(xpath = "//input[@data-qa='login-email']")
    ExtendedWebElement emailInputField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    ExtendedWebElement passwordInputField;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    ExtendedWebElement loginButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String text) {
        emailInputField.type(text);
    }

    public void enterPassword(String text) {
        passwordInputField.type(text);
    }

    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(getDriver());
    }

}
