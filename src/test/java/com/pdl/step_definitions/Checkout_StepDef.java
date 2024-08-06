package com.pdl.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pdl.pages.KcAddToCartPage;
import com.pdl.pages.KcCheckoutPage;
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
	   
	 Searchpage validkeyword=new Searchpage();
		KcAddToCartPage kcaddtocart= new KcAddToCartPage();
		KcCheckoutPage kccheckoutpage= new KcCheckoutPage();

		
		
@Then("User navigates to homepage")
public void user_navigates_to_homepage() throws InterruptedException {
	
logger.info("********* start navigating on home page *************"); 
Thread.sleep(3000);
logger.info("*********** log in time is ended ***************");
	    
}
@Then("search a product, and click on add to cart")
public void search_a_product_and_click_on_add_to_cart() throws InterruptedException {
	validkeyword.search_box();
	 validkeyword.validatekeyword();
	 validkeyword.searchbtn();
logger.info("*********** search is started *************");
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

}

@Then("I should be able to enter my billing details, delivery details, delivery method, payment method and confirm my order")
public void i_should_be_able_to_enter_my_billing_details_delivery_details_delivery_method_payment_method_and_confirm_my_order() {

	logger.info("entring  my billing details, delivery details, delivery method, payment method and confirm my order");
}

@Given("I have some products in my shopping cart and I am logged in to my account")
public void i_have_some_products_in_my_shopping_cart_and_i_am_logged_in_to_my_account() throws InterruptedException {
	Thread.sleep(10000);
	logger.info(" user is already logged in");
	Thread.sleep(10000);
	kccheckoutpage.click_ShoppingCart();
	logger.info("user already has some product in shopping cart");
    
}

@When("I click on the checkout button on the shopping cart page")
public void i_click_on_the_checkout_button_on_the_shopping_cart_page() throws InterruptedException {
	kccheckoutpage.checkoutbtnclickable();
	logger.info("checkout button is functionnal");
	kccheckoutpage.click_checkout();
	logger.info("checkout button is already clicked");
  
}

@Then("I should see an option to check out with my account")
public void i_should_see_an_option_to_check_out_with_my_account() {
   
}

@Then("I should be able to use my saved billing and delivery details or enter new ones, choose a delivery method, a payment method and confirm my order")
public void i_should_be_able_to_use_my_saved_billing_and_delivery_details_or_enter_new_ones_choose_a_delivery_method_a_payment_method_and_confirm_my_order() {

}

@Given("the user is already in my account page")
public void the_user_is_already_in_my_account_page() throws InterruptedException {
   kccheckoutpage.click_myaccount();
   logger.info("my account page in displayed");
}

@When("the user clicks on address book, he should see address book intries information")
public void the_user_clicks_on_address_book_he_should_see_address_book_intries_information() throws InterruptedException {
 logger.info("the user clicks on address book");
	kccheckoutpage.addressbook();
	 logger.info("he is seeing address book intries information");
	
}

@Then("The saved billing and delivery details should be pre-filled in the form and editable")
public void the_saved_billing_and_delivery_details_should_be_pre_filled_in_the_form_and_editable() throws InterruptedException {
  kccheckoutpage.click_edit();
  logger.info("delivery details are editable");
   Thread.sleep(3000);
   kccheckoutpage.displayedupdatedmsg();
   logger.info("display msg is displayed");
   Thread.sleep(3000);
}

@And("The delivery method and payment method should have at least one option available")
public void the_delivery_method_and_payment_method_should_have_at_least_one_option_available() throws InterruptedException {
	logger.info("user starts adding a new address");
	   kccheckoutpage.addaddress();
	logger.info("user clicked on new address");
	   kccheckoutpage.completeinfo();
    logger.info("user is adding his info");
	   kccheckoutpage.selectcountry();
	logger.info("user selected a country");
	   kccheckoutpage.selectstate();
	logger.info("user selected a state");
	   kccheckoutpage.addressdefault();
	logger.info("new address was added");
	   kccheckoutpage.displayedsuccessfullyaddedmsg();
	   
}

@And("The order confirmation page should show the order number, order details, payment details and delivery details")
public void the_order_confirmation_page_should_show_the_order_number_order_details_payment_details_and_delivery_details() {
   
}


}
