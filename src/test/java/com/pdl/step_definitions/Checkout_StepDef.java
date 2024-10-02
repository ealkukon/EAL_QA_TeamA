package com.pdl.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pdl.pages.KcAddToCartPage;
import com.pdl.pages.KcCheckoutPage;
import com.pdl.pages.KukonLogin;
import com.pdl.pages.Searchpage;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_StepDef extends CommonMethods{
	WebDriver driver= Driver.getDriver();
	
	 public static final Logger logger = LogManager.getLogger(Checkout_StepDef.class);
	   
		KukonLogin validloginpage=new KukonLogin();
		Searchpage validkeyword=new Searchpage();
		KcAddToCartPage kcaddtocart= new KcAddToCartPage();
		KcCheckoutPage kccheckoutpage= new KcCheckoutPage();

		
		@Given("I have some products in my shopping cart and I am logged in to my account")
		public void i_have_some_products_in_my_shopping_cart_and_i_am_logged_in_to_my_account() throws InterruptedException {
			//Thread.sleep(10000);
			logger.info(" user is already logged in");
			
			// driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			 //validloginpage.emaillogin(); validloginpage.passwordenter();
			 //validloginpage.loginbutton();
			 

			// Assert.assertTrue(KukonLogin.getMyAccount().contains("account/account"));
			 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			 validloginpage.emaillogin(); validloginpage.passwordenter();
			 validloginpage.loginbutton();
			 

			 Assert.assertTrue(KukonLogin.getMyAccount().contains("account/account"));
			Thread.sleep(1000);
			kccheckoutpage.click_ShoppingCart();
			logger.info("user already has some product in shopping cart");
		    
		}

		@When("I click on the checkout button on the shopping cart page")
		public void i_click_on_the_checkout_button_on_the_shopping_cart_page() throws InterruptedException {
			//kccheckoutpage.outstockalertmsg();
			kccheckoutpage.outstockalertmsg();
			logger.info("checkout button is functionnal");
			kccheckoutpage.click_checkout();
			logger.info("checkout button is already clicked");
		  
		}
		@When("the product is not in stock, we should see the message: ”Products marked with *** are not available in the desired quantity or not in stock!”")
		public void the_product_is_not_in_stock_we_should_see_the_message_products_marked_with_are_not_available_in_the_desired_quantity_or_not_in_stock() throws InterruptedException {
		    logger.info("the product is not in stock");
			kccheckoutpage.outstockalertmsg();
            Thread.sleep(2000);
		    logger.info("outstock msg is displayed");

		}

		@Then("I should see an option to check out with my account")
		public void i_should_see_an_option_to_check_out_with_my_account() throws InterruptedException {
			//kccheckoutpage.outstockalertmsg();
            Thread.sleep(2000);
		    logger.info("outstock msg is displayed");
		public void i_should_see_an_option_to_check_out_with_my_account() {
			

		}

		@Then("I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order")
		public void i_should_be_able_to_use_my_saved_billing_and_delivery_details_or_enter_new_ones_choose_a_delivery_method_a_payment_method_and_confirm_my_order() {

		}





@Given("User navigates to homepage")
public void user_navigates_to_homepage() throws InterruptedException {
logger.info("********* start navigating on home page *************"); 

logger.info("*********** log in time is ended ***************");
	    
}
@Then("search a product, and click on add to cart")
public void search_a_product_and_click_on_add_to_cart() throws InterruptedException {
logger.info("*********** search is started *************");
validkeyword.search_box();
Thread.sleep(3000);
validkeyword.validatekeyword();
Thread.sleep(3000);
validkeyword.searchbtn();
Thread.sleep(3000);
logger.info("****************** add to cart *************");
kcaddtocart.click_AddtoCart();
Thread.sleep(3000);
}


@Then("navigate to shopping cart and click on it")
public void navigate_to_shopping_cart_and_click_on_it() throws InterruptedException {
logger.info("*************** the product was added to the cart ******************");
kccheckoutpage.click_ShoppingCart();
Thread.sleep(3000);

}

@When("click on checkout bouton.")
public void click_on_checkout_bouton() {
	kccheckoutpage.click_checkout();
	logger.info("************* the product was checked out**************");

}

@Then("I should see an option to checkout as a guest")
public void i_should_see_an_option_to_checkout_as_a_guest() {
	logger.info("checkout as a guest option");
	kccheckoutpage.outstockmsgs();
}

@Then("I should be able to enter my billing details, delivery details, delivery method, payment method and confirm my order")
public void i_should_be_able_to_enter_my_billing_details_delivery_details_delivery_method_payment_method_and_confirm_my_order() {

	logger.info("entring  my billing details, delivery details, delivery method, payment method and confirm my order");
}




}
