package com.solvd.lperez.magento.pages;

import com.solvd.lperez.magento.components.CartComponent;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Create an Account')]")
    ExtendedWebElement createAccountButton;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    ExtendedWebElement signInButton;
    @FindBy(xpath = "//ol//li[1]//div[@id='option-label-size-143-item-167']")
    ExtendedWebElement firstHotSellersSize;
    @FindBy(xpath = "//ol//li[1]//div[@id='option-label-color-93-item-56']")
    ExtendedWebElement firstHotSellersColor;
    @FindBy(xpath = "//div[@class='block-content']//ol//li[1]//button[@type='submit']")
    ExtendedWebElement firstHotSellersAddButton;
    @FindBy(xpath = "//span[@class='counter-number']")
    ExtendedWebElement cartElementsCounter;

    @FindBy(xpath = "//aside[@role='dialog']//footer//button[contains(span,'OK')]")
    ExtendedWebElement acceptDeletionButton;
    @FindBy(xpath = "//div[@id='ui-id-1']//strong[@class]")
    ExtendedWebElement cartMessage;
    @FindBy(id = "search")
    ExtendedWebElement searchInput;
    @FindBy(xpath = "//form[@id='search_mini_form']//button")
    ExtendedWebElement searchButton;
    @FindBy(xpath = "//div[@data-block='minicart']//a//span[@class='text']/..")
    ExtendedWebElement openCartButton;
    @FindBy(id = "ui-id-1")
    CartComponent cart;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public CreateAccountPage clickCreateAccountButton() {
        createAccountButton.click();
        return new CreateAccountPage(getDriver());
    }

    public SignInPage clickSingInButton() {
        signInButton.click();
        return new SignInPage(getDriver());
    }

    public void chooseSize() {
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

    public SearchResults searchAProduct(String product) {
        searchInput.type(product);
        clickSearchButton();
        return new SearchResults(getDriver());
    }


}
