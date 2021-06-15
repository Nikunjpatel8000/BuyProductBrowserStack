$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Register.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@Register"
    }
  ],
  "line": 2,
  "name": "Register feature",
  "description": "",
  "id": "register-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7700233202,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  Background:"
    },
    {
      "line": 5,
      "value": "#    Given user is on Homepage"
    },
    {
      "line": 6,
      "value": "#    When user click on Register button"
    },
    {
      "line": 7,
      "value": "#    And user enter all required details"
    },
    {
      "line": 8,
      "value": "#    And click on Register button"
    },
    {
      "line": 9,
      "value": "#    Then user be able to see Your registration completed message"
    }
  ],
  "line": 11,
  "name": "User should be able to Register Successfully And Register User Products Buy Successfully.",
  "description": "",
  "id": "register-feature;user-should-be-able-to-register-successfully-and-register-user-products-buy-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@BuyProducts"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enter all required details",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user be able to see Your registration completed message",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on Computer Category and Select Desktops",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on Add To Cart Button and Select HDD",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on Shopping Cart And Click on ChechBox Terms \u0026 Condition",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Fill-up All Require Details And Click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Ground and click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on Credit card button and fill-up all details",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on Confirm order button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user be able to Buy Product Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDeft.user_is_on_Homepage()"
});
formatter.result({
  "duration": 195611442,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_click_on_Register_button()"
});
formatter.result({
  "duration": 1982814892,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_enter_all_required_details()"
});
formatter.result({
  "duration": 9800764880,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.click_on_Register_button()"
});
formatter.result({
  "duration": 2915160653,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_be_able_to_see_Your_registration_completed_message()"
});
formatter.result({
  "duration": 10038139695,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_click_on_Computer_Category_and_Select_Desktops()"
});
formatter.result({
  "duration": 7003729966,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.click_on_Add_To_Cart_Button_and_Select_HDD()"
});
formatter.result({
  "duration": 5260223229,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 46625,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.click_on_Shopping_Cart_And_Click_on_ChechBox_Terms_Condition()"
});
formatter.result({
  "duration": 94172165,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: Element \u003cspan class\u003d\"cart-label\"\u003e is not clickable at point (1090,22) because another element \u003cp class\u003d\"content\"\u003e obscures it\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NIKUNJBHADANI\u0027, ip: \u0027192.168.29.70\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 89.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210527174632, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 3736, moz:profile: C:\\Users\\Nikunj Bhadani\\App..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 6.3, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: aeea9993-d247-400b-b45d-4b76810bc632\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat org.example.Util.clickOnElement(Util.java:29)\r\n\tat org.example.ComputerPage.clickOnShoppingCart(ComputerPage.java:112)\r\n\tat org.example.MyStepDeft.click_on_Shopping_Cart_And_Click_on_ChechBox_Terms_Condition(MyStepDeft.java:107)\r\n\tat ✽.And Click on Shopping Cart And Click on ChechBox Terms \u0026 Condition(src/test/resources/features/Register.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepDeft.fill_up_All_Require_Details_And_Click_on_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDeft.click_on_Ground_and_click_on_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDeft.click_on_Credit_card_button_and_fill_up_all_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDeft.click_on_Confirm_order_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDeft.user_be_able_to_Buy_Product_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 895594530,
  "status": "passed"
});
});