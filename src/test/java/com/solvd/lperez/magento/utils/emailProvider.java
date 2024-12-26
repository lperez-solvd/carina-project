package com.solvd.lperez.magento.utils;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.annotations.BeforeMethod;

import java.util.UUID;

public class emailProvider extends AbstractTest {

    private String userEmail;  // Shared email for suite execution
    private static final String EMAIL_BASE = "lucas" + UUID.randomUUID().toString().substring(0, 5); // To create a short unique part


    @BeforeMethod
    public void setup() {

        // Store the email to be used in the test methods
        this.userEmail = generateEmailForBrowser("chrome");
    }

    private String generateEmailForBrowser(String browser) {
        // Append 'c' for Chrome and 'f' for Firefox to the base email
        if (browser.equalsIgnoreCase("chrome")) {
            return EMAIL_BASE + "c@google.com";
        } else if (browser.equalsIgnoreCase("firefox")) {
            return EMAIL_BASE + "f@google.com";
        } else {
            throw new IllegalArgumentException("Unknown browser: " + browser);
        }
    }

    // Getter for the email that is shared across the suite
    public String getUserEmail() {
        return userEmail;
    }

}
