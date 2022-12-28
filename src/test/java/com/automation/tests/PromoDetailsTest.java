package com.automation.tests;

import org.testng.annotations.Test;

public class PromoDetailsTest extends BaseTest{
    @Test
    public void verifyPromoDetailsPage(){
        homePage.closePopUp();
        homePage.clickOnSeePromoDetailsLink();
        homePage.verifyListOfDiscountPromoCodes();
    }

}

