package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class HomePageTests implements IAbstractTest {

    @Test
    public void openPage() {
        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        home.chooseSize();
        home.chooseColor();

    }
}
