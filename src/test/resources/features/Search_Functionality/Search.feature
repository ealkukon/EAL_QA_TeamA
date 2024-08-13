@Search

Feature:  Search Functionality
	As a customer,
	I want to search for a product,
	so that I can find what i am looking for.
	


@validkeywordsearch
  Scenario: Searching for a product by keyword
  Then I should see the search box
	When I enter a valid keyword in the search box 
	And I click on the search button
	Then I should see a list of products that match the keyword with their images, names and prices
	


@invalidkeywordsearch
  Scenario Outline: Searching for a product by invalid keyword
   When I enter an invalid "<keyword>" in the search box
   And I click on the search button
   Then I should not be able to see any product images, names, or prices
   And I should receive a message.
 	Examples:
 	|keyword|
 	|Maca|
 	
 	@searchByCatagory
  Scenario Outline: Searching for a product by category
     Then I click on “Search” button and it will land on Search page
     When I enter a "<keyword>" in the search criteria
     And I select a category from the drop-down menu and I click on the search button
     Then I should see a list of products that belong to the category with their images, names, and prices
     
     Examples:
     |keyword|
     |Mac|
     
   @sortsearchresults
   Scenario Outline: Sorting the search results by name, price or rating
    Given I have performed a search and got some results
    When I select an option from the sort by drop-down menu on the right side of the page
    Then I should see the products sorted according to the option I have selected

  Examples:
    | option          |
    | Name (A - Z)    |
    | Name (Z - A)    |
    | Price (Low > High) |
    | Price (High > Low) |
    | Rating (Highest) |
    | Rating (Lowest)|
  