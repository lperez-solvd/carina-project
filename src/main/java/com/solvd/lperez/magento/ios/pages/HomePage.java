package com.solvd.lperez.magento.ios.pages;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SearchResultsBase;
import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.solvd.lperez.magento.ios.components.CartComponent;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    @ExtendedFindBy(iosPredicate = "name = 'Create an Account'")
    ExtendedWebElement createAccountButton;

    @ExtendedFindBy(iosPredicate = "name = 'Sign In'")
    ExtendedWebElement signInButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"S\"`][1]")
    ExtendedWebElement firstHotSellersSize;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"Orange\"`]")
    ExtendedWebElement firstHotSellersColor;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Add to Cart\"])[1]")
    ExtendedWebElement firstHotSellersAddButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"web dialog\"`]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    ExtendedWebElement cartElementsCounter;

    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeButton' AND name == 'OK'")
    ExtendedWebElement acceptDeletionButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText")
    ExtendedWebElement cartMessage;
    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Search'")
    ExtendedWebElement searchInput;
    @FindBy(xpath = "//form[@id='search_mini_form']//button")
    ExtendedWebElement searchButton;
    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeLink' AND name CONTAINS 'My Cart'")
    ExtendedWebElement openCartButton;
    @ExtendedFindBy(iosPredicate = "name == 'web dialog'")
    CartComponent cart;
    @ExtendedFindBy(iosPredicate = "name == \"\uE609\"")
    ExtendedWebElement hamburguerNav;
    @ExtendedFindBy(iosPredicate = "name = 'Account'")
    ExtendedWebElement accountSection;
    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeOther' AND name CONTAINS 'Search'")
    ExtendedWebElement openSearchButton;
    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeOther' AND name == 'Abominable Hoodie'")
    ExtendedWebElement listFirstOption;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Shop New Yoga\"]")
    ExtendedWebElement shopYogButton;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.android.chrome:id/menu_row_text\" and @text=\"Copy link address\"]")
    ExtendedWebElement copyLinkAddress;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPageBase clickCreateAccountButton() {
        hamburguerNav.click();
        waitUntil(driver -> accountSection.isElementPresent(), 10);
        accountSection.click();
        pause(1);
        createAccountButton.click();
        return initPage(CreateAccountPageBase.class);
    }

    public SignInPageBase clickSingInButton() {
        hamburguerNav.click();
        waitUntil(driver -> accountSection.isElementPresent(), 10);
        accountSection.click();
        pause(1);
        signInButton.click();
        return initPage(SignInPageBase.class);
    }

    public void chooseSize() {
        swipe(firstHotSellersSize);
        firstHotSellersSize.click();
    }

    public void chooseColor() {
        swipe(firstHotSellersColor);
        firstHotSellersColor.click();
    }

    public void clickAddToCartButton() {
        swipe(firstHotSellersAddButton);
        firstHotSellersAddButton.click();
    }

    public String getNumberOfElementsInCart() {
        return cartElementsCounter.getAttribute("value");
    }

    public void clickOnCart() {
        pause(5); // maybe would be better an explicit wait until the text is "1"
        openCartButton.click();
    }

    public void acceptDeletion() {
        acceptDeletionButton.click();
    }

    public String getCartMessage() {
        return cart.getCartMessage();
    }

    public void clickSearchButton() {

        searchButton.click();

    }

    public CartComponent getCartComponent() {
        return cart;
    }

    public SearchResultsBase searchAProduct(String product) {
        openSearchButton.click();
        searchInput.type(product + "\n");
        return initPage(SearchResultsBase.class);
    }

    public void typeOnSearchInput(String text) {
        searchInput.type(text);
    }

    public String copyYogaUrl() {
        longTap(shopYogButton);
        waitUntil(d -> copyLinkAddress.isElementPresent(), 10);
        copyLinkAddress.click();
        return getTextFromClipboard();
    }

}