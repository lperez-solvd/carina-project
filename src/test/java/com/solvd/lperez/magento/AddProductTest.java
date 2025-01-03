package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddProductTest extends AbstractTest {


    @Test
    public void addProductToCart() {

        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        home.chooseSize();
        home.chooseColor();
        home.clickAddToCartButton();
        home.clickOnCart();

        SoftAssert sa = new SoftAssert();
        CartComponentBase cart = home.getCartComponent();
        sa.assertEquals(cart.getFirstProductName(), "Radiant Tee", "The product name is not the expected");
        sa.assertEquals(home.getCartComponent().getFirstProductPrice(), "$22.00", "The product price is not the expected");
        sa.assertEquals(home.getNumberOfElementsInCart(), "1", "The number of elements is not the expected");

        sa.assertAll("Some assertion fails!");
    }
}
