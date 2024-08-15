@Login
Feature: Login functionality for openCart E-commerce Webside
  
  As a returning customer,
  I want to log in with my email and password
  so that I can access my account and personal information.


  @BSmoke @smoke
  Scenario: Successful login valid credentials
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account

  @CRegrassion
  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter an incorrect email under the returning customer section
    Then I enter an incorrect password under the returning customer section
    And I click on the login button I should see an error message saying “Warning: No match for E-Mail Address and/or Password.

  @Dregression
  Scenario: Requesting a password reset link
    Given I am on the login page
    When I click on the forgotten password link under the returning customer section
    Then I should see a password reset form with a field for email
    And I should be able to request a password reset link after entering my email and clicking on the continue button
