@smoketest1
Feature: smoke test


  Scenario: Successful login valid credentials
 
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account


  Scenario: Searching for a product by keyword
  
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account
    Then I should see the search box
    When I enter a valid keyword in the search box
    And I click on the search button
    Then I should see a list of products that match the keyword with their images, names and prices

@check
 Scenario: verify the confirmation message after adding to cart 
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account
    Then I should see the search box
    When I enter a valid keyword in the search box
    And I click on the search button
    Then I should see a list of products that match the keyword with their images, names and prices
    When the user clicks on add to cart 
    Then He should see a confirmation message that says: 'Success: You have added [product name] to your shopping cart'
    And the number of items in my cart should increase by one

    @22
  Scenario: Check out as a registered customer
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account
    Given I have some products in my shopping cart and I am logged in to my account
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out with my account
    And I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order
   #When the product is not in stock, we should see the message: ”Products marked with *** are not available in the desired quantity or not in stock!”

   

 Scenario: checkout as a guest
  Given User should be logged out
   Then User navigates to homepage
   Then I should see the search box
   When I enter a valid keyword in the search box
   And I click on the search button
   Then I should see a list of products that match the keyword with their images, names and prices
   And click on add to cart
   Then navigate to shopping cart and click on it
   When click on checkout bouton.
   Then I should see an option to checkout as a guest
   Then I should be able to enter my billing details, delivery details, delivery method, payment method and confirm my order


