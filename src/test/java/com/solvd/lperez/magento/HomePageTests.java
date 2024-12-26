package com.solvd.lperez.magento;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.Test;

public class HomePageTests extends AbstractTest {

    @Test
    public void openPage() {
        HomePage home = new HomePage(getDriver());
        home.open();
    }
}
