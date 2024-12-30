package com.solvd.lperez.magento.common.components;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class CartComponentBase extends AbstractUIObject {

    public CartComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract String getFirstProductName();

    public abstract String getFirstProductPrice();

    public abstract void clickRemoveItem();
}
