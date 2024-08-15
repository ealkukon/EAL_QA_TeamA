package com.pdl.step_definitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.pdl.pages.Invalidsearchpage;
import com.pdl.pages.SearchCatagoryPage;
import com.pdl.pages.Searchpage;

import com.pdl.utilities.CommonMethods;

import io.cucumber.java.en.*;
public class SearchCatagory_Step extends CommonMethods{

	//Valid_LoginPage login=new Valid_LoginPage();
	Searchpage validkeyword=new Searchpage();
	Invalidsearchpage invalid=new Invalidsearchpage();
	SearchCatagoryPage catagory=new SearchCatagoryPage();
	public static final Logger logger = (Logger) LogManager.getLogger(SearchCatagory_Step.class);
	
	
@When("I click on “Search” button and it will land on Search page")
public void i_click_on_search_button_and_it_will_land_on_search_page() throws InterruptedException {
	validkeyword.searchbtn();
	catagory.searchpage();
	
	Thread.sleep(1000);
	logger.info("after clicking on search button, search page will land");
   
}
  @When("I enter a {string} in the search criteria")
    public void i_enter_a_in_the_search_criteria(String string) throws InterruptedException {
	  catagory.Enterkeyword();
	  Thread.sleep(1000);
	  logger.info("keyword has entered");
  }

 @And("I select a category from the drop-down menu and I click on the search button")
public void i_select_a_category_from_the_drop_down_menu_and_i_click_on_the_search_button() throws InterruptedException {
	catagory.dropdownclick();
	catagory.catagoryselection();
	catagory.searchbtncatagory();
   // validkeyword.searchbtn();
	
	Thread.sleep(2000);
	logger.info("after selecting a catagory , search button should be clicked");
}
	

	@Then("I should see a list of products that belong to the category with their images, names, and prices")
	public void i_should_see_a_list_of_products_that_belong_to_the_category_with_their_images_names_and_prices() throws InterruptedException {
	
		validkeyword.verifySearchResults();
		Thread.sleep(2000);
	     // catagory.phone();
	     logger.info("mac page should display with all infos");
	}

	
	

}
