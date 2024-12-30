package com.solvd.lperez.magento;

import com.solvd.lperez.magento.desktop.pages.CreateAccountPage;
import com.solvd.lperez.magento.desktop.pages.CreateAccountSuccessPage;
import com.solvd.lperez.magento.desktop.pages.HomePage;
import com.solvd.lperez.magento.utils.emailProvider;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CreateAccountTests extends emailProvider {


    @Test
    public void createAccount() {

        HomePage home = new HomePage(getDriver());
        home.open();
        CreateAccountPage createPage = home.clickCreateAccountButton();

        createPage.enterName("Lucas");
        createPage.enterLastName("Perez");
        createPage.enterEmail(getUserEmail());
        createPage.enterPass("1LuPoIo4");

        CreateAccountSuccessPage createSuccess = createPage.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "Thank you for registering with Main Website Store.", "The successful message is not the expected one");

    }

    @Test(dependsOnMethods = {"createAccount"})
    public void createAccountWithExistingEmail() {
        HomePage home = new HomePage(getDriver());
        CreateAccountPage createPage = home.clickCreateAccountButton();

        createPage.enterName("Lucas");
        createPage.enterLastName("Perez");
        createPage.enterEmail(getUserEmail());
        createPage.enterPass("1LuPoIo4");

        CreateAccountSuccessPage createSuccess = createPage.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", "The fail message is not the expected one");
    }

}
