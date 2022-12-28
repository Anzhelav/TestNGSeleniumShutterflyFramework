package com.automation.tests;

import org.testng.annotations.Test;

public class EmptyNotepadMessageTest extends BaseTest{

    @Test
    public void verifyPopUpEmptyNotepadMsg(){
        homePage.closePopUp();
        homePage.clickOnHomeOfficeOption();
        homePage.clickOnNotepadsIcon();
        homePage.clickOnFirstItem();
        homePage.clickOnPersonalizeBtn();
        homePage.enterDetailsToPersonalizeItem();
        homePage.clickOnDoneBtn();
        homePage.presOnAddToCartBtn();
        homePage.verifyPopUpEmptyNotepadMsgIsDisplayed();
    }
}
