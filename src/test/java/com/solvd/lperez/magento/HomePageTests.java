package com.solvd.lperez.magento;

import com.solvd.carina.demo.utils.MobileContextUtils;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests implements IAbstractTest {

    @Test
    public void openPage() {
        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        MobileContextUtils contextHelper = new MobileContextUtils();
        contextHelper.switchMobileContext(MobileContextUtils.View.NATIVE);
        Assert.assertEquals(home.copyYogaUrl(),"https://magento.softwaretestingboard.com/collections/yoga-new.html");

    }
}
