package com.solvd.lperez.magento.desktop.pages.components;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartComponent extends CartComponentBase {

    @FindBy(xpath = "//strong[@class='product-item-name']//a")
    ExtendedWebElement firstProductName;
    @FindBy(className = "price")
    ExtendedWebElement firstProductPrice;
    @FindBy(xpath = "//a[@title='Remove item']")
    ExtendedWebElement deleteItemButton;

    protected CartComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getFirstProductName() {
        return firstProductName.getText();
    }

    public String getFirstProductPrice() {
        return firstProductPrice.getText();
    }

    public void clickRemoveItem() {
        deleteItemButton.click();
    }
}
