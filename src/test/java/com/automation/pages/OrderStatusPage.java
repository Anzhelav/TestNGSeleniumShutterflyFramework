package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderStatusPage extends BasePage{
    @FindBy(id="order-number-input")
    WebElement orderNum;

    @FindBy(id="email-adress-input")
    WebElement email;

    @FindBy(xpath="//input[@class = 'uig-button uig-primary-button lookup-button']")
    WebElement findMyOrderBtn;

    @FindBy(xpath="//div[@class='osc-lookup-form-error-container osc-lookup-form-row']")
    WebElement invalidMessage;


    public void inputAllFieldsWithInvalidData() {
        orderNum.sendKeys("1");
        email.sendKeys("vas@gmail.com");
    }

    public void pressFindMyOrderBtn() {
        findMyOrderBtn.click();
    }

    public void verifyInvalidMessage() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(invalidMessage.isDisplayed(),"Invalid message is not displayed");
    }
}
