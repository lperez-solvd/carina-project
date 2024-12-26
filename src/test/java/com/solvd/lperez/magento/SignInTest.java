package com.solvd.lperez.magento;

import com.solvd.lperez.magento.utils.emailProvider;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignInTest extends emailProvider {

    @Test()
    public void signInWithCorrectCredentials() {
        // Set the path to the ChromeDriver executable

        HomePage home = new HomePage(getDriver());
        SignInPage signin = home.clickSingInButton();
        signin.enterEmail(getUserEmail());
        signin.enterPassword("1LuPoIo4");

        SignInSuccessPage signinSuccess = signin.clickSubmitButton();

        Assert.assertTrue(signinSuccess.getWelcomeMessage().contains("Lucas Perez"));

    }
}
