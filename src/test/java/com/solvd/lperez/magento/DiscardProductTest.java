package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.desktop.pages.HomePage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DiscardProductTest extends AbstractTest {

    @Test
    public void addAndDiscardProduct() {

        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        home.chooseSize();
        home.chooseColor();
        home.clickAddToCartButton();

        home.clickOnCart();

        // use an alternative wait because element loading process
        home.getCartComponent().clickRemoveItem();

        home.acceptDeletion();

        Assert.assertEquals(home.getCartMessage(), "You have no items in your shopping cart.", "The message is not the expected");


    }
}
