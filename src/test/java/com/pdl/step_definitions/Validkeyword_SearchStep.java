package com.pdl.step_definitions;
import org.apache.logging.log4j.Logger;

import com.pdl.pages.Searchpage;


import org.apache.logging.log4j.LogManager;
import com.pdl.utilities.CommonMethods;


import io.cucumber.java.en.*;






public class Validkeyword_SearchStep extends CommonMethods {
	
	//Valid_LoginPage login=new Valid_LoginPage();
	Searchpage validkeyword=new Searchpage();
	public static final Logger logger = LogManager.getLogger(Validkeyword_SearchStep.class);
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException {
		logger.info("user is logging ");
		Thread.sleep(10000);
		logger.info("user is logged in");
		Thread.sleep(3000);
	}
	  
	
	@Then("I should see the search box")
	public void i_should_see_the_search_box() {
		validkeyword.search_box();
		logger.info("search box should be visible");
	}
	
	@When("I enter a valid keyword in the search box")
	public void i_enter_a_valid_keyword_in_the_search_box() {
	   validkeyword.validatekeyword();
	   logger.info("valid keyword has enetred");
	}   

	

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		validkeyword.searchbtn();
		logger.info("search button in clicked");
	}

	@Then("I should see a list of products that match the keyword with their images, names and prices")
	public void i_should_see_a_list_of_products_that_match_the_keyword_with_their_images_names_and_prices() {
		validkeyword.verifySearchResults();
		logger.info("the list of products that match the keyword with their images, names ans prieces are visible");
	
	}
	

	}


