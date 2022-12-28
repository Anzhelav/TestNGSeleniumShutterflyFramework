package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    FavoritesPage favoritesPage;
    OrderStatusPage orderStatusPage;
    SignInPage signInpage;

    @BeforeMethod
    public void setUp() {
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        favoritesPage = new FavoritesPage();
        orderStatusPage = new OrderStatusPage();
        signInpage = new SignInPage();
    }

    @AfterMethod
    public void quit() {
        DriverUtils.getDriver().quit();
    }
}
