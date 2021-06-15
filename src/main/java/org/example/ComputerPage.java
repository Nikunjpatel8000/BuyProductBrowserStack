package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Util {//ComputerPage is sub class of Util class
    private By _clickOnComputer = By.linkText("Computers");
    //

    private By _welcomeMsgComputerPage = By.xpath("//div[@class=\"page-title\"]/h1");
    //Create a variable for store string value.
    String ecpectWelcomeMsgComputerPage = "Computers";
    //Create a variable for store xpath value.
    private By _clickOnDesktops = By.xpath("//ul[@class=\"sublist\"]/li[1]/a");
    //Create a variable for store xpath value.
    private By _builedComputer = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[1]");


    private By _selectByValueRam = By.xpath("//select[@id = \"product_attribute_2\"]");

    private By _clickOnHdd = By.xpath("//input[@id=\"product_attribute_3_7\"]");
    //Create a variable for store xpath value.

    private By _clickOnAddToCartButton = By.xpath("//button[@id=\"add-to-cart-button-1\"]");

    private By _clickOnShopingCart = By.xpath("//li/a[@href=\"/cart\"]/span[1]");

    private By _clickOnCheckBoxOfTermAndCondition = By.id("termsofservice");

    private By _clickOnCheckOutButton = By.id("checkout");

    private By _selectCountry = By.xpath("//div/select[@data-trigger=\"country-select\"]");

    private By _typeTextCityName = By.xpath("//div[@class=\"edit-address\"]/div[7]/input");

    private By _typeAddress = By.xpath("//div[@class=\"edit-address\"]/div[8]/input");

    private By _typeZipCode = By.xpath("//div[@class=\"edit-address\"]/div[10]/input");

    private By _typeMobileNo = By.xpath("//div[@class=\"edit-address\"]/div[11]/input");



    private By _clickOnContinueButton = By.xpath("//button[@onclick=\"Billing.save()\"]");

    private By _clickOnContinueButtonAfter = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");



    private By _clickOnCreditCard = By.xpath("//input[@id=\"paymentmethod_1\"]");

    private By _clickOn2ContinueButton = By.xpath("//div/button[@class=\"button-1 payment-method-next-step-button\"]");

    private By _cardholderName = By.xpath("//tbody/tr[2]/td[2]/input");

    private By _cardNumber = By.xpath("//tbody/tr[3]/td[2]/input");

    private By _expirationDate = By.id("ExpireMonth");

    private By _expirationYear = By.id("ExpireYear");

    private By _cardCodeCvv = By.xpath("//tbody/tr[5]/td[2]/input");

    private By _clickAfterVisaCardContinueButton = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");

    private By _clickOnConfirmButton = By.xpath("//div[@id=\"confirm-order-buttons-container\"]/button");

    private By _buyProductSuccessfully = By.xpath("//div[@class=\"title\"]/strong[text () = 'Your order has been successfully processed!']");

    private String _expectBuyProductSuccessfully = "Your order has been successfully processed!";


    public void clickOnComputerCategory(){
        waitUntilElementClickable(_clickOnComputer,30);
        clickOnElement(_clickOnComputer);
    }

    public void verifyUserIsOnComputerPage() {
        //assert equals for expect and actual result
     //   Assert.assertEquals(getTextFromElement(_welcomeMsgComputerPage), ecpectWelcomeMsgComputerPage, "User Is Not Computer Page");
    }
    public void clickOnDesktopsCategory() {
        //wait for 10 second for clickable
        waitUntilElementClickable(_clickOnDesktops, 30);
        //Click the variable
        clickOnElement(_clickOnDesktops);
    }
    public void clickOnBuildComputer() {
        //wait for 20 second for variable
        waitUntilElementClickable(_builedComputer, 30);
        //Click the variable
        clickOnElement(_builedComputer);
    }
    public void clickOnHDD() {
        selectFromDropDownByIndex(_selectByValueRam,1);
         waitUntilElementClickable(_clickOnHdd,30);
         clickOnElement(_clickOnHdd);
    }
    public void clickOnClickOnAddToCartButton() {
       // sleep(5);

        //wait for 20 second for clickable
        waitUntilElementClickable(_clickOnAddToCartButton, 30);
        //Click the variable
        clickOnElement(_clickOnAddToCartButton);
        sleep(5);
    }
    public void clickOnShoppingCart() {
        //wait for 20 second for clickable
        waitUntilElementClickable(_clickOnShopingCart, 30);
        //Click the variable
        clickOnElement(_clickOnShopingCart);
        sleep(2);
    }
    public void clickOnCheckBoxOfTermAndCondition() {
        //wait for 20 second for clickable
        waitUntilElementClickable(_clickOnCheckBoxOfTermAndCondition, 30);
        //Click the variable
        clickOnElement(_clickOnCheckBoxOfTermAndCondition);
        sleep(2);
    }

    public void _clickOnCheckOutButton() {
        //wait for 20 second for clickable
        waitUntilElementClickable(_clickOnCheckOutButton, 30);
        //Click the variable
        clickOnElement(_clickOnCheckOutButton);

    }public void _fillUpShippingAddress() {
        selectFromDropDownByVisibleText(_selectCountry, "India");
        sleep(2);
        typeText(_typeTextCityName, "Surat");
        sleep(2);
        typeText(_typeAddress, "A.B.C Socity Gujrat");
        typeText(_typeZipCode, "123321");
        sleep(2);
        typeText(_typeMobileNo, "1234554321");
        waitUntilElementClickable(_clickOnContinueButton,30);
        clickOnElement(_clickOnContinueButton);
    }
    public void _paymentMethod() {
        waitUntilElementClickable(_clickOnContinueButtonAfter,30);
        clickOnElement(_clickOnContinueButtonAfter);
        waitUntilElementClickable(_clickOnCreditCard, 30);
        clickOnElement(_clickOnCreditCard);
        waitUntilElementClickable(_clickOn2ContinueButton, 30);
        clickOnElement(_clickOn2ContinueButton);
        typeText(_cardholderName, "Raj B Patel");
        sleep(2);
        typeText(_cardNumber, "6250946000000016\n" + "\n");
        sleep(2);
        selectFromDropDownByIndex(_expirationYear, 11);
        sleep(2);
        selectFromDropDownByValue(_expirationYear, "2033");

        typeText(_cardCodeCvv, "123");
        waitUntilElementClickable(_clickAfterVisaCardContinueButton,30);
        clickOnElement(_clickAfterVisaCardContinueButton);

    }
    public void clickOnConfirmButton(){
        waitUntilElementClickable(_clickOnConfirmButton,30);
        clickOnElement(_clickOnConfirmButton);
    }
    public void userAddProductSuccessfully(){
          Assert.assertEquals(getTextFromElement(_buyProductSuccessfully),_expectBuyProductSuccessfully,"User Not Buy Products Successfully !!!");
        System.out.println(getTextFromElement(_buyProductSuccessfully));
    }
}
