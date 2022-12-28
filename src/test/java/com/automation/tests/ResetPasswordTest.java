package com.automation.tests;

import org.testng.annotations.Test;

public class ResetPasswordTest  extends BaseTest{

    @Test
    public void verifyUserCanResetPasswordWithValidEmail(){
        homePage.closePopUp();
        homePage.pressOnSignBtn();
        homePage.pressOnSignBtn();
        homePage.clickOnSignInLinkFromSignInMenu();
        signInpage.clickOnForgotPassword();
        signInpage.inputValidEmailAddress();
        signInpage.clickSendBtn();
        signInpage.verifyResetPasswordEmailIsSendMessage();

    }
}
