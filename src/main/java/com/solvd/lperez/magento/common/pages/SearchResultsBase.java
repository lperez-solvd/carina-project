package com.solvd.lperez.magento.common.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SearchResultsBase extends AbstractPage {

    public SearchResultsBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getProductTitle();
}
