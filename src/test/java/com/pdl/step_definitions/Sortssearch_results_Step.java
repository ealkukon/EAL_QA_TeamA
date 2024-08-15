package com.pdl.step_definitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pdl.pages.Invalidsearchpage;
import com.pdl.pages.SearchCatagoryPage;
import com.pdl.pages.Searchpage;
import com.pdl.pages.Sortssearch_results_Page;
import com.pdl.utilities.CommonMethods;

import io.cucumber.java.en.*;

public class Sortssearch_results_Step extends CommonMethods{
	Searchpage validkeyword=new Searchpage();
	Invalidsearchpage invalid=new Invalidsearchpage();
	SearchCatagoryPage catagory=new SearchCatagoryPage();
	Sortssearch_results_Page sort=new Sortssearch_results_Page();
	
	public static final Logger logger = LogManager.getLogger(SearchCatagory_Step.class);
	
	
	@Given("I have performed a search and got some results")
	public void i_have_performed_a_search_and_got_some_results() {
		
		validkeyword.search_box();//from searchpage class
		validkeyword.validatekeyword();//same
		 validkeyword.searchbtn();//same
		logger.info(" valid products have been searched and products have been displayed with results ");	
	}

	@When("I select an option from the sort by drop-down menu on the right side of the page")
	public void i_select_an_option_from_the_sort_by_drop_down_menu_on_the_right_side_of_the_page() throws InterruptedException {
		sort.selectSortOption("Name (A - Z)");//copy the "text" from inspection
		Thread.sleep(1000);
		sort.selectSortOption("Name (Z - A)");
		Thread.sleep(1000);
		sort.selectSortOption("Price (Low > High)");
		Thread.sleep(1000);
		sort.selectSortOption("Price (High > Low)");
		Thread.sleep(1000);
		sort.selectSortOption("Rating (Highest)");
		Thread.sleep(1000);
		sort.selectSortOption("Rating (Lowest)");
		Thread.sleep(1000);
		logger.info("dropdown menu have sroting the products in different criteria");
	}

	@Then("I should see the products sorted according to the option I have selected")
	public void i_should_see_the_products_sorted_according_to_the_option_i_have_selected() {
		validkeyword.verifySearchResults();
		logger.info("products sorted according to the option I have selected");
	}
}
