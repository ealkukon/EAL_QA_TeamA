
Feature: UnsuccessfullLogin functionality for openCart E-commerce Webside

  As a returning customer,
  I want to log in with my email and password
  so that I can access my account and personal information.
  
  @Unsuccessful  
  Scenario: Unsuccessful login invalid credentials
    Given I am on the login page
    When I enter an incorrect email or password and click on the login button under the returning customer section
    Then I should see an error message saying “Warning: No match for E-Mail Address and/or Password.”


