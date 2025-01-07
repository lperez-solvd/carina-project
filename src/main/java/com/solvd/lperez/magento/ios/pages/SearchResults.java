package com.solvd.lperez.magento.ios.pages;

import com.solvd.lperez.magento.common.pages.SearchResultsBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SearchResultsBase.class)
public class SearchResults extends SearchResultsBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"main\"`]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]")
    ExtendedWebElement firstProductTitle;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getProductTitle() {
        swipe(firstProductTitle);
        return firstProductTitle.getAttribute("name");
    }


}
