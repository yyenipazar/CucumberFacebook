@web
Feature: Login feature
  Background:
    Given I am on home page

  @login-1
  Scenario: Verify signup button
    When I enter ilhan into firstname text fields on home screen
    And I enter Turkmen into lastname text fields on home screen
    Then I verify that signup button is disable at homepage
  @login-2
  Scenario Outline: Signup form should not accept any invalid email address
    When I enter Yasemin into firstname text fields on home screen
    And I enter Arslan into lastname text fields on home screen
    And I enter <email> into mobile number text fields on home screen
    And I enter <password> into newpassword fields on home screen
    And I click on gender radio button
    And I click on signup button on home screen
    Then I verify error message for invalid email on home screen

    Examples:
      | email                            | password   |
      |  @@@                             |  1234565   |
      |  @example.com                    |  1234      |
      |  email.example.com               |  10394     |
      |  51#@                            |  1235      |




