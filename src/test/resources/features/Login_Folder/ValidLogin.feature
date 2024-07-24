
Feature: Login

  As a returning customer
  I want to log in with my email and password
  so that I can access my account and personal information.

@validlogin
	Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter my valid email and valid password
    Then I click on the login button 
    When I should be logged in succesfully and directed to the My Account page
    Then the list of options for the account should include options for my account, my orders, My Affiliate Account and Newsletter

 