package com.automation.tests;

import org.testng.annotations.Test;

public class ShopCardsButtonTest extends BaseTest{

    @Test
    public void verifyShopCardsButton(){
        homePage.closePopUp();
        homePage.clickOnShopCardsBtn();
        homePage.verifyCardsStationerySectionIsDisplayed();
    }
}

