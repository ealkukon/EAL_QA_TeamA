package com.pdl.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.pdl.pages.Invalidsearchpage;
import com.pdl.pages.Searchpage;
import com.pdl.pages.Valid_LoginPage;
import com.pdl.utilities.CommonMethods;

import io.cucumber.java.en.*;

public class InvalikeywordSearch_Step extends CommonMethods {
	
	Valid_LoginPage login=new Valid_LoginPage();
	Searchpage validkeyword=new Searchpage();
	Invalidsearchpage invalid=new Invalidsearchpage();
	
	public static final Logger logger = LogManager.getLogger(InvalikeywordSearch_Step.class);
	
	@When("I enter an invalid {string} in the search box")
	public void i_enter_an_invalid_in_the_search_box(String string) {
		
		invalid.enterinvalidword();
		validkeyword.searchbtn();
		logger.info("invalid keword has entererd on search box and search button is clicked");
	}

	@Then("I should not be able to see any product images, names, or prices")
	public void i_should_not_be_able_to_see_any_product_images_names_or_prices() {
		invalid.noproductcontent();
		logger.info("No products infos are visible");
	    
	}

	@Then("I should receive a message.")
	public void i_should_receive_a_message() {
		 invalid.messagedisplay();
		 logger.info("no product matches message should display");
	}

}
