package com.solvd.lperez.magento;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTests extends AbstractTest {

    @Test()
    public void searchAProduct() {
        HomePage home = new HomePage(getDriver());
        SearchResults results = home.searchAProduct("abominable hoodie");

        Assert.assertEquals(results.getProductTitle(), "Abominable Hoodie");
    }
}
