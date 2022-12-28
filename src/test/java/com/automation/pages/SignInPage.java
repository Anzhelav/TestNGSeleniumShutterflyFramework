package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage extends BasePage{
    @FindBy(id="toForgotPassword")
    WebElement forgotPasswordLink;

    @FindBy(id="email")
    WebElement emailAdField;

    @FindBy(id="forgotPwdButton")
    WebElement sendBtn;


    @FindBy(xpath="(//div[@class='confirm-forgot-password-sub-heading'])[1]")
    WebElement resetPassMessage;
    public void clickOnForgotPassword() {
        forgotPasswordLink.click();
    }

    public void inputValidEmailAddress() {
        emailAdField.sendKeys("vas@gmail.com");
    }

    public void clickSendBtn() {
        sendBtn.click();
    }

    public void verifyResetPasswordEmailIsSendMessage() {
        Assert.assertTrue(resetPassMessage.isDisplayed(),"not displayed");
    }
}
