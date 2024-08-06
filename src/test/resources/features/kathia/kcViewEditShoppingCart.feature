@ViewEditMyShoppingCart @smoke
Feature: View & Edit my Shopping Cart

Scenario: Viewing my shopping cart

Given I have added some products to the cart
When I click on the cart icon on the top right corner of the page
Then I should see a summary of the products in the cart with their images, names, quantities, prices and totals
And I should see the subtotal and total amount of my order

Scenario: Changing the quantity of a product in the cart

Given I am on the shopping cart page
When I change the quantity of a product and click on the refresh button
Then I should see the updated quantity and price of the product
And I should see the updated subtotal and total amount of my order
