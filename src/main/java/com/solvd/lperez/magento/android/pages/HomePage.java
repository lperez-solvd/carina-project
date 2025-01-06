package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.android.components.CartComponent;
import com.solvd.lperez.magento.common.pages.CreateAccountPageBase;
import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SearchResultsBase;
import com.solvd.lperez.magento.common.pages.SignInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    @FindBy(xpath = "//android.view.View[@content-desc='Create an Account']")
    ExtendedWebElement createAccountButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    ExtendedWebElement signInButton;
    @FindBy(xpath = "//android.widget.ListView[@text='Size']/android.view.View[@text=\"S\"][1]")
    ExtendedWebElement firstHotSellersSize;
    @FindBy(xpath = "//android.widget.ListView[@text='Color']/android.view.View[@text=\"Orange\"]")
    ExtendedWebElement firstHotSellersColor;
    @FindBy(xpath = "//android.widget.Button[@text='Add to Cart'][1]")
    ExtendedWebElement firstHotSellersAddButton;
    @FindBy(xpath = "(//android.widget.Button[@text=\"Add to Cart\"])[1]")
    ExtendedWebElement cartElementsCounter;

    @FindBy(xpath = "//android.app.Dialog//android.widget.Button[@text='OK']")
    ExtendedWebElement acceptDeletionButton;
    @FindBy(xpath = "//div[@id='ui-id-1']//strong[@class]")
    ExtendedWebElement cartMessage;
    @FindBy(xpath = "//android.webkit.WebView[@text=\"Home Page\"]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.widget.EditText")
    ExtendedWebElement searchInput;
    @FindBy(xpath = "//form[@id='search_mini_form']//button")
    ExtendedWebElement searchButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Search']")
    ExtendedWebElement openCartButton;
    @FindBy(xpath = "//android.widget.ListView")
    CartComponent cart;
    @FindBy(xpath = "//android.webkit.WebView[@text='Home Page']/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]")
    ExtendedWebElement hamburguerNav;
    @FindBy(xpath = "//android.widget.TextView[@text='Account']")
    ExtendedWebElement accountSection;
    @FindBy(xpath = "//android.widget.TextView[@text=\"\uE615\"]")
    ExtendedWebElement openSearchButton;
    @FindBy(xpath = "//android.view.View[@text=\"Abominable Hoodie\"]")
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
        firstHotSellersColor.click();
    }

    public void clickAddToCartButton() {
        firstHotSellersAddButton.click();
    }

    public String getNumberOfElementsInCart() {
        return cartElementsCounter.getText();
    }

    public void clickOnCart() {
        pause(5); // maybe would be better an explicit wait until the text is "1"
        openCartButton.click();
    }

    public void acceptDeletion() {
        acceptDeletionButton.click();
    }

    public String getCartMessage() {
        return cartMessage.getText();
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
        waitUntil(d -> listFirstOption.isElementPresent(), 10);
        listFirstOption.click();
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