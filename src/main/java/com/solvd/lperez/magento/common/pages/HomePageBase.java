package com.solvd.lperez.magento.common.pages;

import com.solvd.lperez.magento.common.components.CartComponentBase;
import com.solvd.lperez.magento.desktop.pages.CreateAccountPage;
import com.solvd.lperez.magento.desktop.pages.SearchResults;
import com.solvd.lperez.magento.desktop.pages.SignInPage;
import com.solvd.lperez.magento.desktop.pages.components.CartComponent;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage implements IMobileUtils {


    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CreateAccountPage clickCreateAccountButton();

    public abstract SignInPage clickSingInButton();

    public abstract void chooseSize();

    public abstract void chooseColor();

    public abstract void clickAddToCartButton();

    public abstract String getNumberOfElementsInCart();

    public abstract void clickOnCart();

    public abstract void acceptDeletion();

    public abstract String getCartMessage();

    public abstract void clickSearchButton();

    public abstract CartComponentBase getCartComponent();

    public abstract SearchResults searchAProduct(String product);
    public abstract void typeOnSearchInput(String text);

}
