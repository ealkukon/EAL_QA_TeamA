@finalsmoke
Feature: smoke

  Scenario: final smoke
    Given I am on the login page
    When I enter my email and password and click on the login button under the returning customer section
    Then Click on login button
    Then I should see a welcome message and a list of options for my account
    Then I should see the search box
    When I enter a valid keyword in the search box
    And I click on the search button
    Then I should see a list of products that match the keyword with their images, names and prices
    When the user clicks on add to cart
    Then He should see a confirmation message that says: 'Success: You have added [product name] to your shopping cart!'
    And the number of items in my cart should increase by one
    Given I have some products in my shopping cart and I am logged in to my account
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out with my account
