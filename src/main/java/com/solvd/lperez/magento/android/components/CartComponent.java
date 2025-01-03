package com.solvd.lperez.magento.android.components;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartComponent extends CartComponentBase {

    @FindBy(xpath = "(//android.view.View/android.view.View[2]/android.widget.TextView")
    ExtendedWebElement firstProductName;
    @FindBy(xpath = "//android.view.View/android.widget.TextView")
    ExtendedWebElement firstProductPrice;
    @FindBy(xpath = "//android.view.View/android.view.View[4]/android.view.View[2]/android.widget.TextView[1]")
    ExtendedWebElement deleteItemButton;

    public CartComponent(WebDriver driver, SearchContext searchContext) {
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
