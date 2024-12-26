package com.solvd.lperez.magento;

import com.solvd.lperez.magento.utils.emailProvider;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CreateAccountTests extends emailProvider {


    @Test
    public void createAccount() {

        HomePage home = new HomePage(getDriver());
        home.open();
        CreateAccountPage create = home.clickCreateAccountButton();

        create.enterName("Lucas");
        create.enterLastName("Perez");
        create.enterEmail(getUserEmail());
        create.enterPass("1LuPoIo4");

        CreateAccountSuccessPage createSuccess = create.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "Thank you for registering with Main Website Store.");

    }

    @Test(dependsOnMethods = {"createAccount"})
    public void createAccountWithExistingEmail() {
        HomePage home = new HomePage(getDriver());
        CreateAccountPage create = home.clickCreateAccountButton();

        create.enterName("Lucas");
        create.enterLastName("Perez");
        create.enterEmail(getUserEmail());
        create.enterPass("1LuPoIo4");

        CreateAccountSuccessPage createSuccess = create.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
    }

}
