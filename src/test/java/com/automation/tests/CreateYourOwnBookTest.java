package com.automation.tests;

import org.testng.annotations.Test;

public class CreateYourOwnBookTest extends BaseTest{

    @Test
    public void verifyLoginPageIsDisplayed(){
        homePage.closePopUp();
        homePage.clickOnTurnYourMemoriesIntoPhotoBooksOption();
        homePage.clickOnCreateYourOwnCategory();
        homePage.clickOnPersonalizeButton();
        homePage.clickOnLetsGoBtn();
        homePage.clickOnContinueBtn();
        loginPage.verifyPage();
    }
}
