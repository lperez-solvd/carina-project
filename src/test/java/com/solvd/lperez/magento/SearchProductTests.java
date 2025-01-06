package com.solvd.lperez.magento;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SearchResultsBase;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTests extends AbstractTest {

    @Test()
    public void searchAProduct() {
        HomePageBase home = initPage(HomePageBase.class);
        home.open();
        SearchResultsBase results = home.searchAProduct("abominable hoodie");

        Assert.assertEquals(results.getProductTitle(), "Abominable Hoodie", "The founded product name is not the expected");

    }
}
