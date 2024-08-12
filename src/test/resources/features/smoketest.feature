@smoke
Feature: smoke test


  Scenario: Successful login valid credentials
 
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account



  Scenario: Searching for a product by keyword
  
    Then I should see the search box
    When I enter a valid keyword in the search box
    And I click on the search button
    Then I should see a list of products that match the keyword with their images, names and prices

 
 