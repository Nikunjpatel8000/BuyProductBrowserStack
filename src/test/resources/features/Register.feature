#@Register
Feature: Register feature

#  Background:
#    Given user is on Homepage
#    When user click on Register button
#    And user enter all required details
#    And click on Register button
#    Then user be able to see Your registration completed message
  @BuyProducts
  Scenario: User should be able to Register Successfully And Register User Products Buy Successfully.
    Given user is on Homepage
    When user click on Register button
    And user enter all required details
    And click on Register button
    Then user be able to see Your registration completed message
    When user click on Computer Category and Select Desktops
    And Click on Add To Cart Button and Select HDD
    And Click on add to cart button
    And Click on Shopping Cart And Click on ChechBox Terms & Condition
    And Fill-up All Require Details And Click on Continue Button
    And Click on Ground and click on Continue Button
    And click on Credit card button and fill-up all details
    And click on Confirm order button
    Then user be able to Buy Product Successfully
