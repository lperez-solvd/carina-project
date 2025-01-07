package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.CreateAccountSuccessPageBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.utils.emailProvider;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccountTests extends emailProvider {


    @Test
    public void createAccount() {

        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        CreateAccountPageBase createPage = home.clickCreateAccountButton();

        createPage.enterName("Lucas");
        createPage.enterLastName("Perez");
        createPage.enterEmail(getUserEmail());
        createPage.enterPass("1LuPoIo4");

        CreateAccountSuccessPageBase createSuccess = createPage.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "Thank you for registering with Main Website Store.", "The successful message is not the expected one");

    }

    @Test(dependsOnMethods = {"createAccount"})
    public void createAccountWithExistingEmail() {
        HomePageBase home = initPage(HomePageBase.class);
        CreateAccountPageBase createPage = home.clickCreateAccountButton();

        createPage.enterName("Lucas");
        createPage.enterLastName("Perez");
        createPage.enterEmail(getUserEmail());
        createPage.enterPass("1LuPoIo4");

        CreateAccountSuccessPageBase createSuccess = createPage.clickSubmitButton();

        Assert.assertEquals(createSuccess.getAlertMessage(), "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", "The fail message is not the expected one");
    }

}
