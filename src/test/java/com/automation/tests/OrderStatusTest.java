package com.automation.tests;

import org.testng.annotations.Test;

public class OrderStatusTest extends BaseTest{
    @Test
    public void verifyInvalidMessageWithInvalidOrderNumber() throws InterruptedException {
        homePage.closePopUp();
        homePage.clickOnSignInLink();
        homePage.clickOnOrderStatusFromSignInMenu();
        orderStatusPage.inputAllFieldsWithInvalidData();
        orderStatusPage.pressFindMyOrderBtn();
        orderStatusPage.verifyInvalidMessage();

    }
}
