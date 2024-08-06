@checkout

Feature: checkout
 

  @checkout1
  Scenario: checkout as a guest
    Given User navigates to homepage
    Then search a product, and click on add to cart
    Then navigate to shopping cart and click on it 
    When click on checkout bouton.
    Then I should see an option to checkout as a guest
    Then I should be able to enter my billing details, delivery details, delivery method, payment method and confirm my order
  
   @checkoutascustomer @smoke
  Scenario: Check out as a registered customer
    Given I have some products in my shopping cart and I am logged in to my account
    When I click on the checkout button on the shopping cart page
    Then I should see an option to check out with my account
    And I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order
    
    @billing&delivery
    Scenario: billing and delivery
    Given the user is already in my account page
    When the user clicks on address book, he should see address book intries information 
    Then The saved billing and delivery details should be pre-filled in the form and editable
    And The delivery method and payment method should have at least one option available
    And The order confirmation page should show the order number, order details, payment details and delivery details
    