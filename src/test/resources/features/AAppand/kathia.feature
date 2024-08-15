@AddtoCart-PC30
Feature: Add to Cart
  
  As a customer,
  I want to add a product to the shopping cart 
  so that I can buy it later or continue shopping.

  @tags
  Scenario: Adding a product to the cart from the Any page That contains Product View
    Given I am on any page
    When I click on the add to cart button
    Then I should see a confirmation message saying “Success: You have added [product name] to your shopping cart!”
    And the number of items in my cart should increase by one

  @tags
  Scenario: Add multiple products to cart
    Given I am on the product page
    When I click on the "Add to Cart" button for multiple products
    Then all the products should be added to my cart
    And the cart icon should display the updated number of items

  @tags-pc-32
  Scenario: Checking out as a guest
    Given I have some products in my shopping cart
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out as a guest
    And I should be able to enter my billing details, delivery details, delivery method, payment method and confirm my order

  @tags
  Scenario: Checking out as a registered customer
    Given I have some products in my shopping cart and I am logged in to my account
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out with my account
    And I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order
