package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.solvd.lperez.magento.common.pages.SignInSuccessPageBase;
import com.solvd.lperez.magento.utils.emailProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignInTest extends emailProvider {

    @Test()
    public void signInWithCorrectCredentials() {

        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        SignInPageBase signin = home.clickSingInButton();
        signin.enterEmail(getUserEmail()); //getUserEmail()
        signin.enterPassword("1LuPoIo4"); //

        SignInSuccessPageBase signinSuccess = signin.clickSubmitButton();

        Assert.assertTrue(signinSuccess.getWelcomeMessage().contains("Lucas Perez"), "The Welcome message don't contains the user name");

    }
}
