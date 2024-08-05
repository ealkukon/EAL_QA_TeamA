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

  Scenario: validate add to cart
    When validate the add to cart button should be enabled only if the product is in stock
    Then confirmation message should show the product name, image and price
    And Verify that available product is added to the cart

 
  Scenario: Check out as a registered customer
    Given I have some products in my shopping cart and I am logged in to my account
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out with my account
    And I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order


  Scenario: billing and delivery
    Given the user is already in my account page
    When the user clicks on address book, he should see address book intries information
    Then The saved billing and delivery details should be pre-filled in the form and editable
    And The delivery method and payment method should have at least one option available
    And The order confirmation page should show the order number, order details, payment details and delivery details

 
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