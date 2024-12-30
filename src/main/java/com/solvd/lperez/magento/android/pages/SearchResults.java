package com.solvd.lperez.magento.android.pages;

import com.solvd.lperez.magento.common.pages.HomePageBase;
import com.solvd.lperez.magento.common.pages.SearchResultsBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SearchResultsBase.class)
public class SearchResults extends SearchResultsBase {

    @FindBy(xpath = "//ol//li[1]//strong//a")
    ExtendedWebElement firstProductTitle;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getProductTitle() {
        return firstProductTitle.getText();
    }


}
