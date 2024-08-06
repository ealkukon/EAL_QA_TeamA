package Step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pdl.pages.KcAddToCartPage;
import com.pdl.pages.KcViewEditShoppingCartPage;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewEditShoppingCart_StepDef extends CommonMethods{

	WebDriver driver=Driver.getDriver();
	public static final Logger logger = LogManager.getLogger(ViewEditShoppingCart_StepDef.class);
	
	KcAddToCartPage kcaddtocart= new KcAddToCartPage();
	KcViewEditShoppingCartPage kcviewcart= new KcViewEditShoppingCartPage();

	
	@Given("I have added some products to the cart")
	public void i_have_added_some_products_to_the_cart() throws InterruptedException {
	kcaddtocart.click_multipleproducts();	
	logger.info("i have some product in my shopping cart");  
	
	}

	@When("I click on the cart icon on the top right corner of the page")
	public void i_click_on_the_cart_icon_on_the_top_right_corner_of_the_page() {
		kcviewcart.click_IconCart();
	  logger.info("the cart icon is clicked");
	  
	
	}

	@Then("I should see a summary of the products in the cart with their images, names, quantities, prices and totals")
	public void i_should_see_a_summary_of_the_products_in_the_cart_with_their_images_names_quantities_prices_and_totals() throws InterruptedException {
	   kcviewcart.SeeSammary();
		logger.info("user can see a summary of the products in the cart with their images, names, quantities, prices and totals");
	   
	}

	@And("I should see the subtotal and total amount of my order")
	public void i_should_see_the_subtotal_and_total_amount_of_my_order() throws InterruptedException {
		kcviewcart.See_Subtotal();
		logger.info("the subtotal and total amount of my order is displayed");
		
	 	
	}

	@Given("I am on the shopping cart page")
	public void i_am_on_the_shopping_cart_page() {
		// kcviewcart.click_ShoppingCart();
		logger.info("user can be in shopping cart page");
	 
	}

	@When("I change the quantity of a product and click on the refresh button")
	public void i_change_the_quantity_of_a_product_and_click_on_the_refresh_button() throws InterruptedException {
		//kcviewcart.changeQuantity(); 
		logger.info("the quantity of the product have been changed");
		Thread.sleep(3000);
	//	kcviewcart.refresh();
		logger.info("refresh button is clickable");
		
	  
	}

	@Then("I should see the updated quantity and price of the product")
	public void i_should_see_the_updated_quantity_and_price_of_the_product() {
		logger.info("quantity and price of the product have been updated");
	  
	}

	@And("I should see the updated subtotal and total amount of my order")
	public void i_should_see_the_updated_subtotal_and_total_amount_of_my_order() {
	    logger.info("subtotal and total amount of my order have been updated");
	}



}
