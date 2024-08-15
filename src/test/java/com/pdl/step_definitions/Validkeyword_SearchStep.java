package com.pdl.step_definitions;
import org.apache.logging.log4j.Logger;

import com.pdl.pages.Searchpage;


import org.apache.logging.log4j.LogManager;
import com.pdl.utilities.CommonMethods;


import io.cucumber.java.en.*;

public class Validkeyword_SearchStep extends CommonMethods{
	
		Searchpage validkeyword=new Searchpage();
		public static final Logger logger = LogManager.getLogger(Validkeyword_SearchStep.class);
	

		
		@Then("I should see the search box")
		public void i_should_see_the_search_box() throws InterruptedException {
			validkeyword.search_box();
			logger.info("search box should be visible");
			Thread.sleep(2000);
		}
		
		@When("I enter a valid keyword in the search box")
		public void i_enter_a_valid_keyword_in_the_search_box() throws InterruptedException {
		   validkeyword.validatekeyword();
		   logger.info("valid keyword has enetred");
		   Thread.sleep(2000);
		}   
		
		@When("I click on the search button")
		public void i_click_on_the_search_button() throws InterruptedException {
		   validkeyword.searchbtn();
		   logger.info("I click on the search button");
		   Thread.sleep(2000);
}
		@Then("I should see a list of products that match the keyword with their images, names and prices")
		public void i_should_see_a_list_of_products_that_match_the_keyword_with_their_images_names_and_prices() throws InterruptedException {
			
			validkeyword.verifySearchResults();
			logger.info("list of products should be visible or display with name, price and images");
			  Thread.sleep(2000);
			
		}
}