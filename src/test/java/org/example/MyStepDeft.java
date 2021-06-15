package org.example;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepDeft extends Util {
//    //Crate Object Of LogInPage
//    LogInPage logInPage = new LogInPage();
//    //Crate Object Of LogInSuccessfully
//    LogInSuccessfully logInSuccessfully = new LogInSuccessfully();

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccess registerSuccess = new RegisterSuccess();
    ComputerPage computerPage = new ComputerPage();

    //Login All Steps

//    @Given("^user is on login page$")
//    public void user_is_on_login_page() {
//        logInPage.verifyUserIsOnLoginPage();
//    }
//
//    @When("^user enter valid username and password$")
//    public void user_enter_valid_username_and_password() {
//        logInPage.userEntersLoginDetails();
//    }
//
//    @When("^user click on Login button$")
//    public void user_click_on_Login_button() {
//        logInPage.clickOnLoginButton();
//    }
//
//    @Then("^user should be login successfully$")
//    public void user_should_be_login_successfully() {
//        logInSuccessfully.verifyUserLoginSuccessfully();
//    }
//
//    @When("^user enter invalid and empty user name \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void user_enter_invalid_and_empty_user_name_and_password(String username, String password) {
//
//        logInPage.userEnterUserNameAndPassword(username, password);
//    }
//
//    @Then("^user should be login not successfully and user should see error message \"([^\"]*)\"$")
//    public void user_should_be_login_not_successfully_and_user_should_see_error_message(String errorMessage) {
//
//        logInPage.userLoginNotSuccess(errorMessage);
//    }

//    //Registration All Steps

    @Given("^user is on Homepage$")
    public void user_is_on_Homepage() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("^user click on Register button$")
    public void user_click_on_Register_button() {
        homePage.clickOnRegisterButton();
    }

    @When("^user enter all required details$")
    public void user_enter_all_required_details() {
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.userEntersRegistationDetails();
    }

    @When("^click on Register button$")
    public void click_on_Register_button() {
        registerPage.clickOnRegisterSubmitButton();
    }

    @Then("^user be able to see Your registration completed message$")
    public void user_be_able_to_see_Your_registration_completed_message() {
        registerSuccess.verifyUserRegistrationSuccessfully();
      //  registerPage.clickOnRegisterContinueButton();


    }

    @When("^user click on Computer Category and Select Desktops$")
    public void user_click_on_Computer_Category_and_Select_Desktops() {
        computerPage.clickOnComputerCategory();
        computerPage.verifyUserIsOnComputerPage();
        computerPage.clickOnDesktopsCategory();
        computerPage.clickOnBuildComputer();
        computerPage.clickOnHDD();


    }

    @When("^Click on Add To Cart Button and Select HDD$")
    public void click_on_Add_To_Cart_Button_and_Select_HDD() {
        computerPage.clickOnClickOnAddToCartButton();
    }

    @When("^Click on add to cart button$")
    public void click_on_add_to_cart_button() {
    }

    @When("^Click on Shopping Cart And Click on ChechBox Terms & Condition$")
    public void click_on_Shopping_Cart_And_Click_on_ChechBox_Terms_Condition() {
        computerPage.clickOnShoppingCart();
    }

    @When("^Fill-up All Require Details And Click on Continue Button$")
    public void fill_up_All_Require_Details_And_Click_on_Continue_Button() {
        computerPage.clickOnCheckBoxOfTermAndCondition();
    }

    @When("^Click on Ground and click on Continue Button$")
    public void click_on_Ground_and_click_on_Continue_Button() {
        computerPage._clickOnCheckOutButton();
    }

    @When("^click on Credit card button and fill-up all details$")
    public void click_on_Credit_card_button_and_fill_up_all_details() {
        computerPage._fillUpShippingAddress();
    }

    @When("^click on Confirm order button$")
    public void click_on_Confirm_order_button() {
        computerPage._paymentMethod();
        computerPage.clickOnConfirmButton();
    }

    @Then("^user be able to Buy Product Successfully$")
    public void user_be_able_to_Buy_Product_Successfully() {
        computerPage.userAddProductSuccessfully();

    }


}
