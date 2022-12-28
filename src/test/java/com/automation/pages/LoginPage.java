package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{
    @FindBy(id = "signInButton")
    WebElement signInBtn;

    public void verifyPage() {
        Assert.assertTrue(signInBtn.isDisplayed(), "Sign In button is not displayed");
    }
}
