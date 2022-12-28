package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[text() = 'SHOP CARDS']")
    WebElement shopCardsBtn;

    @FindBy(xpath = "//img[contains(@alt,'memorable')]")
    WebElement makeItMemorableEventBanner;

    @FindBy(xpath = "//img[@alt = 'Close']")
    WebElement closePopUpBtn;

    @FindBy(xpath = "//a[contains(@data-linkname, 'HOMEOFFICE')]")
    WebElement homeOfficeOption;

    @FindBy(xpath = "//img[@alt = 'Personalized note pads']")
    WebElement notepadsIcon;

    @FindBy(xpath = "//img[@alt = 'Take Note']")
    WebElement firstItem;

    @FindBy(xpath = "//a[@class = 'uig-button uig-primary-button personalize-button']")
    WebElement personalizeBtn;

    @FindBy(id = "stringField-full_name")
    WebElement detailsField;

    @FindBy(id = "personalizeFormModalButton1")
    WebElement doneBtn;

    @FindBy(id = "addToCartLink")
    WebElement addToCartBtn;

    @FindBy(id = "warningTitle")
    WebElement emptyNotepadMsg;

    @FindBy(xpath = "//img[contains(@alt, 'Photo books')]")
    WebElement turnYourMemoriesIntoPhotoBooksOption;

    @FindBy(xpath = "//img[@alt = 'Create Your Own']")
    WebElement createYourOwnCategory;

    @FindBy(xpath = "//a[@data-linkname = 'product:choosestyle|personalize']")
    WebElement personalizeButton;

    @FindBy(xpath = "//a[contains(text(), 'LET’S GO')]")
    WebElement letsGoBtn;

    @FindBy(xpath = "//button[contains(text(), 'CONTINUE')]")
    WebElement continueBtn;

    @FindBy(id="seePromoDetailsPromoBanner")
    WebElement seePromoDetailsLink;

    @FindBy(xpath = "(//input[@class='text_box text_box_icon'])[2]")
    WebElement searchField;

    @FindBy(xpath="(//span[@class='Icon desktop-unfavorite '])[2]")
    WebElement heartIcon;

    @FindBy(id="myfavorites")
    WebElement myFavoritesLink;

    @FindBy(xpath = "//img[@alt='Holiday Pines']")
    WebElement holidayCard;

    @FindBy(xpath="//span[@class='signIn-label minWidth']")
    WebElement signInLink;

    @FindBy(xpath="//a[@data-linkname='OrderStatus|Global|122322|2|Nav']")
    WebElement orderStatus;

    @FindBy(xpath="//a[text()='Sign In']")
    WebElement signInLinkOnSignInMenu;


    public void clickOnShopCardsBtn() {
        shopCardsBtn.click();
    }

    public void verifyCardsStationerySectionIsDisplayed() {
        Assert.assertTrue(makeItMemorableEventBanner.isDisplayed(), "Cards Stationery section is not displayed");
    }

    public void closePopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(closePopUpBtn));
        closePopUpBtn.click();
    }

    public void clickOnHomeOfficeOption() {
        homeOfficeOption.click();
    }

    public void clickOnNotepadsIcon() {
        notepadsIcon.click();
    }

    public void clickOnFirstItem() {
        firstItem.click();
    }

    public void clickOnPersonalizeBtn() {
        personalizeBtn.click();
    }

    public void enterDetailsToPersonalizeItem() {
        detailsField.sendKeys("A");
    }

    public void clickOnDoneBtn() {
        doneBtn.click();
    }

    public void presOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void verifyPopUpEmptyNotepadMsgIsDisplayed() {
        Assert.assertTrue(emptyNotepadMsg.isDisplayed(), "Empty notepad message is not displayed");
    }

    public void clickOnCreateYourOwnCategory() {
        createYourOwnCategory.click();
    }

    public void clickOnPersonalizeButton() {
        personalizeButton.click();
    }

    public void clickOnLetsGoBtn() {
        letsGoBtn.click();
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void clickOnTurnYourMemoriesIntoPhotoBooksOption() {
        turnYourMemoriesIntoPhotoBooksOption.click();
    }

    public void clickOnSeePromoDetailsLink() {
        seePromoDetailsLink.click();
    }

    public void verifyListOfDiscountPromoCodes() {
        List<WebElement> listOfDiscounts = driver.findElements(By.xpath("//div[@class='promotions']"));
        for( WebElement element : listOfDiscounts){
            Assert.assertTrue(element.isDisplayed(),"discount are not diplayed");

        }

    }

    public void inputSearchRequest() {
        searchField.sendKeys("holiday"+ Keys.ENTER);
    }

    public void clickOnHearticon() throws InterruptedException {
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOf(holidayCard));

        Actions actions = new Actions(driver);
        actions.moveToElement(holidayCard).click(heartIcon).build().perform();

        //heartIcon.click();
    }

    public void clickOnMyFavoritesLink() {
        myFavoritesLink.click();
    }

    public void clickOnSignInLink() {
        signInLink.click();
    }

    public void clickOnOrderStatusFromSignInMenu() {
        orderStatus.click();
    }

    public void pressOnSignBtn() {
        signInLink.click();
    }

    public void clickOnSignInLinkFromSignInMenu() {
        signInLinkOnSignInMenu.click();
    }
}


