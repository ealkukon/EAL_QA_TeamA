@AddToCart
Feature: Add to cart 

Background: 
  Given User navigates to Homepage
  Then select a product to the cart from the product view page

  @confirmationmsg 
  Scenario: verify the confirmation message after adding to cart 
    When the user clicks on add to cart 
    Then He should see a confirmation message that says: 'Success: You have added [product name] to your shopping cart!'
    And the number of items in my cart should increase by one
    
     @validatecart 
    Scenario: validate add to cart 
  
    When validate the add to cart button should be enabled only if the product is in stock
    Then confirmation message should show the product name, image and price
    And  Verify that available product is added to the cart

    @borders 
  Scenario: red border
  
   When hover over on the add to cart button,  A Red border should appear surrounding it
  
 
   @multipleproduct
  Scenario: Add multiple products to cart
  
Then the product page should have an Add to Cart button
When I click on the Add to Cart button for multiple products
Then all the products should be added to my cart
Then the cart icon should display the updated number of items
#Then remove/ delete option should be visible, and be able to remove any product
   
