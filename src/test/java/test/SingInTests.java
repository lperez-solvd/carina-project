package test;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.pages.HomePage;
import test.pages.SignInPage;

public class SingInTests extends AbstractTest {
    @Test ()
    public void enterCorrectCredentialsTest () {
        HomePage home = new HomePage(getDriver());
        home.open();

        SignInPage singIn = home.clickSignInButton();
        singIn.enterEmail("qwerty7@gmail.com");
        singIn.enterPassword("qwerty123");


        HomePage homeBack =  singIn.clickLoginButton();

        Assert.assertEquals(homeBack.getWelcomeMessage(), "Logged in as Yevhenii");

    }
}
