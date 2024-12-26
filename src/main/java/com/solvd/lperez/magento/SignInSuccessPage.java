package com.solvd.lperez.magento;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInSuccessPage extends AbstractPage {


    @FindBy(xpath = "//span[@class='logged-in']")
    ExtendedWebElement welcomeMessage;

    public SignInSuccessPage(WebDriver driver) {
        super(driver);
    }


    public String getWelcomeMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='logged-in']")));

        return welcomeMessage.getText();


    }

}
