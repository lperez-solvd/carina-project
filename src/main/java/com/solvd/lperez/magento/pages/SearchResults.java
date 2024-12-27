package com.solvd.lperez.magento.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResults extends AbstractPage {

    @FindBy(xpath = "//ol//li[1]//strong//a")
    ExtendedWebElement firstProductTitle;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return firstProductTitle.getText();
    }
}
