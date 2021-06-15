  ## ( LoginFeature ) user for all scenario run
#@LoginFeature
#Feature: Login feature
#
##background use for precondition and more repeat steps
#  Background:
#    Given user is on login page
#
# # ( LoginSuccess ) user for this scenario run only
#  @LoginSuccess
#  Scenario: User should be able to Login with valid credentials successfully.
#    When user enter valid username and password
#    And user click on Login button
#    Then user should be login successfully
#
## ( LoginUnSuccess ) user for this scenario outline run only
#  @LoginUnSuccess
#  Scenario Outline: User should be not able to login invalid credentials and empty filed
#    When user enter invalid and empty user name "<userName>" and password "<password>"
#    And user click on Login button
#    Then user should be login not successfully and user should see error message "<errorMessage>"
#    Examples:
#      | userName | password | errorMessage             |
#      | Admin    | Test123  | Invalid credentials      |
#      | Raj      | admin123 | Invalid credentials      |
#      | Admin    |          | Password cannot be empty |
#      |          | admin123 | Username cannot be empty |
#      | Raj      |          | Password cannot be empty |
#      |          | Test123  | Username cannot be empty |
#      |          |          | Username cannot be empty |
#      | Raj      | Test123  | Invalid credentials      |
