package com.solvd.lperez.magento;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddProductTest extends AbstractTest {


    @Test
    public void addProductToCart() {

        HomePage home = new HomePage(getDriver());
        home.open();
        home.chooseSize();
        home.chooseColor();
        home.clickAddToCartButton();

        Assert.assertEquals(home.getNumberOfElementsInCart(), "1");
    }
}
