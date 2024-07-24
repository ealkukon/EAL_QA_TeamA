package com.pdl.step_definitions;
import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import com.pdl.pages.Valid_LoginPage;
import com.pdl.utilities.CommonMethods;

import com.pdl.utilities.Driver;

import io.cucumber.java.en.*;


public class Valid_LoginStep extends CommonMethods {
	WebDriver driver=Driver.getDriver();
	public static final Logger logger = LogManager.getLogger(Valid_LoginStep.class);
    Valid_LoginPage validloginpage=new Valid_LoginPage ();
	

@Given("I am on the login page")
public void i_am_on_the_login_page() {
	
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	validloginpage.VerifyPageTitle("pagetitle is verified");
	logger.info("landing on loging page");
}

@When("I enter my valid email and valid password")
public void i_enter_my_valid_email_and_valid_password() throws InterruptedException {
	
	validloginpage.emaillogin();
	 validloginpage.passwordenter();
	 Thread.sleep(2000);
	logger.info("I enter valid email and valid password");
}

@Then("I click on the login button")
public void i_click_on_the_login_button() throws InterruptedException {
	
	validloginpage.loginbutton();
	logger.info(" i  clicked on login button");
	Thread.sleep(2000);
}


@When("I should be logged in succesfully and directed to the My Account page")
public void i_should_be_logged_in_succesfully_and_directed_to_the_my_account_page() {
	
     String pageTitle = driver.getTitle();
     
  		// Verify the title
  		    try {
  		        Assert.assertEquals(pageTitle, "My Account");
  		        System.out.println("Title matches");
  		    } catch (AssertionError e) {
  		        System.out.println("Title does not match");
  		      logger.info("logging should be successful and directed to the My Account Page"); 
  		        throw e;  // Re-throw the assertion error to ensure the test fails
  		    }
  		    
		// Verify the title
	    /*if(pageTitle.equals("My Account")) {
	        System.out.println("Title matches");
	    } else {
	        System.out.println("Title does not match");
	        logger.info("logging should be successful and directed to the My Account Page");
	    }
	    */
}  
		
@Then("the list of options for the account should include options for my account, my orders, My Affiliate Account and Newsletter")
public void the_list_of_options_for_the_account_should_include_options_for_my_account_my_orders_my_affiliate_account_and_newsletter() throws InterruptedException {
    
	validloginpage.alloptions();
	logger.info("all listed otions should be verified");
	Thread.sleep(2000);
}


}



