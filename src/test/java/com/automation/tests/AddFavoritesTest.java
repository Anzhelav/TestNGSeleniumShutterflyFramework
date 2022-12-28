package com.automation.tests;

import org.testng.annotations.Test;

public class AddFavoritesTest extends BaseTest {
    @Test
    public void verifyUserCanAddFavorites() throws InterruptedException {
        homePage.closePopUp();
        homePage.inputSearchRequest();
        homePage.clickOnHearticon();
        homePage.clickOnMyFavoritesLink();
        favoritesPage.verifyItemIsAdded();
    }

}