package com.solvd.lperez.magento;

import com.solvd.lperez.magento.pages.HomePage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends AbstractTest {

    @Test
    public void openPage() {
        HomePage home = new HomePage(getDriver());
        home.open();
        Assert.assertTrue(home.isPageOpened(), "Page hasn't been opened correctly");
    }
}
