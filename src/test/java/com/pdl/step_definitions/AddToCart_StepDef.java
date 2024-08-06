package com.pdl.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pdl.pages.KcAddToCartPage;
import com.pdl.pages.KukonLogin;
import com.pdl.pages.Searchpage;
import com.pdl.step_definitions.LoginStepDef;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.*;

public class AddToCart_StepDef extends CommonMethods {
	
	
		
		WebDriver driver=Driver.getDriver();
		public static final Logger logger = LogManager.getLogger(AddToCart_StepDef.class);
		
		KukonLogin validloginpage=new KukonLogin();
		Searchpage validkeyword=new Searchpage();
	
		KcAddToCartPage kcaddtocart= new KcAddToCartPage();
	    
		
		@Given("User navigates to Homepage")
		public void user_navigates_to_homepage1() throws InterruptedException {
			logger.info("********* start navigating on home page *************"); 
	    	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    	validloginpage.emaillogin();
	    	validloginpage.passwordenter();
	    	validloginpage.loginbutton();
	
			 Assert.assertTrue(KukonLogin.getMyAccount().contains("account/account"));
			Thread.sleep(1000);
			logger.info("*********** log in time is ended ***************");
			
		}	
	
		@Then("select a product to the cart from the product view page")
		public void select_a_product_to_the_cart_from_the_product_view_page() throws InterruptedException {
		logger.info("*********** selecting product is started *************");
		validkeyword.search_box();
		Thread.sleep(3000);
		validkeyword.validatekeyword();
		Thread.sleep(3000);
		validkeyword.searchbtn();
		Thread.sleep(3000);
	
	 
		kcaddtocart.select_Productimage();
		Thread.sleep(3000);
		logger.info("*********** selecting product is ended ****************");
		}
	
		@When("the user clicks on add to cart")
		public void the_user_clicks_on_add_to_cart() throws InterruptedException {
		logger.info("*****click add to cart ********");
		//CommonMethods.waitFor(10);
		kcaddtocart.click_AddtoCart();
		logger.info("*************** the product was added to the cart ******************");
		Thread.sleep(3000);
		}
		
		/*@And("click on add to cart")
		public void click_on_add_to_cart() throws InterruptedException {
	
			logger.info("*****click add to cart ********");
			//CommonMethods.waitFor(10);
			kcaddtocart.click_AddtoCart();
			logger.info("*************** the product was added to the cart ******************");
			Thread.sleep(3000);
	
		}*/
	
		@ Then("He should see a confirmation message that says: “Success: You have added [product name] to your shopping cart!”")
		public void he_should_see_a_confirmation_message_that_says_success_you_have_added_product_name_to_your_shopping_cart() throws InterruptedException {
		kcaddtocart.confirmationtmsg();
		logger.info("************** confirmation message displyed *********"); 
		Thread.sleep(3000);
		}
	
		@Then("the number of items in my cart should increase by one")
		public void the_number_of_items_in_my_cart_should_increase_by_one() throws InterruptedException {
			kcaddtocart.itemsconfirmation();
		logger.info("*************** shopping cart increased by one ***************"); 
		Thread.sleep(3000);
		}
	
	
		@When("validate the add to cart button should be enabled only if the product is in stock")
		public void validate_the_add_to_cart_button_should_be_enabled_only_if_the_product_is_in_stock() {
		  
		logger.info("*********** add to cart button is enabeled if product is in stock ********");
		kcaddtocart.validateCart();
		  }
		 
		  
		  @Then("confirmation message should show the product name, image and price")
		  public void
		  confirmation_message_should_show_the_product_name_image_and_price() throws InterruptedException {
		  logger.info("***************** the msg is confirmed *****************");
		 // kcaddtocart.confirm();
		  
		  }
		  
		  @Then("Verify that available product is added to the cart")
		  public void verify_that_available_product_is_added_to_the_cart() {
			  kcaddtocart.itemsconfirmation();
			  logger.info("********** available product is added ***********");
		  }
		 
		 
		  @When("hover over on the add to cart button,  A Red border should appear surrounding it")
		  public void hover_over_on_the_add_to_cart_button_a_red_border_should_appear_surrounding_it()
				  throws InterruptedException {
			 logger.info("*********** start over over *************");
			 kcaddtocart.hoverover();
			 Thread.sleep(3000);
			kcaddtocart.redborders();
		 Thread.sleep(3000);
		  }
		  @Then("the product page should have an Add to Cart button")
		  public void the_product_page_should_have_an_add_to_cart_button() throws InterruptedException {
			  logger.info("********* add to cart button on the product page  **********");
			  kcaddtocart.addtocartexiste();
			  Thread.sleep(2000);
		  
		  
		  }
		  @When("I click on the Add to Cart button for multiple products")
		  public void i_click_on_the_add_to_cart_button_for_multiple_products() throws InterruptedException {
			  logger.info("********* start clicking on add to cart button for multiple product  **********");
		  kcaddtocart.click_multipleproducts();    
		  
		  }
	
		  @Then("all the products should be added to my cart")
		  public void all_the_products_should_be_added_to_my_cart() {
			  logger.info("********* all product added to the shopping cart   **********");
		     	  }
	
		  @Then("the cart icon should display the updated number of items")
		  public void the_cart_icon_should_display_the_updated_number_of_items() {
			  kcaddtocart.itemsconfirmation();
			  logger.info("********* cart icon displayed the updated number  **********");
		   	  }
	
				
		  @Then("remove\\/ delete option should be visible, and be able to remove any product")
		  public void remove_delete_option_should_be_visible_and_be_able_to_remove_any_product() {
		  kcaddtocart.click_remove();
		  logger.info("******** product removed**********");
		  
		  }
		  
	
		 }


	

	 
