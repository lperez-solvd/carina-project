package com.solvd.lperez.magento.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartComponent extends AbstractUIObject {

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
