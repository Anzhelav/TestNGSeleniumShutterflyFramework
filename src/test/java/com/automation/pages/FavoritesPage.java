package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FavoritesPage extends BasePage{
    @FindBy(xpath = "//a[@id = 'title_1566899']")
    WebElement firstFavorite;
    public void verifyItemIsAdded() {
        Assert.assertTrue(firstFavorite.isDisplayed(),"Favorite item is not displayed");
    }
}
