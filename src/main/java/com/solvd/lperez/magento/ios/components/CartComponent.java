package com.solvd.lperez.magento.ios.components;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartComponentBase.class)
public class CartComponent extends CartComponentBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[2]")
    ExtendedWebElement firstProductName;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[5]")
    ExtendedWebElement firstProductPrice;
    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeLink' AND name CONTAINS 'Remove'")
    ExtendedWebElement deleteItemButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText")
    ExtendedWebElement cartMessage;

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

    public String getCartMessage() {
        return cartMessage.getText();
    }
}
