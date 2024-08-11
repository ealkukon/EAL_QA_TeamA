package com.pdl.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pdl.pages.KukonLogin;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Stepdefination extends CommonMethods{
WebDriver driver=Driver.getDriver();
	
	public static final Logger logger = LogManager.getLogger(Login_Stepdefination.class);
	KukonLogin validloginpage=new KukonLogin();//Called KukonLogin page from pom page
	
    // login page
    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
    	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    	Thread.sleep(5000);
    	logger.info("landind on login page");
   
    }

    @When("I enter my email and password and click on the login button under the returning customer section")
    public void i_enter_my_email_and_password_and_click_on_the_login_button_under_the_returning_customer_section() throws InterruptedException {
    	validloginpage.emaillogin();
    	validloginpage.passwordenter();
    	Thread.sleep(5000);
    	logger.info("I enter my email and password and click on the login button under the returning customer section");
    
    }
    @Then("Click on login button")
    public void click_on_login_button() throws InterruptedException {
    	validloginpage.loginbutton();
    	Thread.sleep(5000);
    	logger.info("Click on login button");
    }

    @Then("I should see a welcome message and a list of options for my account")
    public void i_should_see_a_welcome_message_and_a_list_of_options_for_my_account() throws InterruptedException {
    	//Assert that the current URL contains the my account page rout
       Assert.assertTrue(KukonLogin.getMyAccount().contains("account/account"));
  

	}    //Unsuccessful login
    @When("I enter an incorrect email under the returning customer section")
    public void i_enter_an_incorrect_email_under_the_returning_customer_section() throws InterruptedException {
    	validloginpage.invalidemaillogin();
    	Thread.sleep(5000);
    	logger.info("I enter an incorrect email under the returning customer section");
        
    }
    @Then("I enter an incorrect password under the returning customer section")
    public void i_enter_an_incorrect_password_under_the_returning_customer_section() throws InterruptedException {
    	validloginpage.invalidpasswordenter();
    	Thread.sleep(5000);
    	logger.info("I enter an incorrect password under the returning customer section");
    }

    @Then("I click on the login button I should see an error message saying “Warning: No match for E-Mail Address and\\/or Password.")
    public void i_click_on_the_login_button_i_should_see_an_error_message_saying_warning_no_match_for_e_mail_address_and_or_password() throws InterruptedException {
    	validloginpage.invalidloginbutton();
    	Thread.sleep(5000);
    	logger.info("I click on the login button I should see an error message saying “Warning: No match for E-Mail Address and\\\\/or Password.");
    }
    
    //forgotten password
    @When("I click on the forgotten password link under the returning customer section")
    public void i_click_on_the_forgotten_password_link_under_the_returning_customer_section() throws InterruptedException {
    	validloginpage.forgetpassword();
    	Thread.sleep(5000);
    	logger.info("I click on the forgotten password link under the returning customer section");
   
    }
    @Then("I should see a password reset form with a field for email")
    public void i_should_see_a_password_reset_form_with_a_field_for_email() throws InterruptedException {
    	validloginpage.emailagain();
    	Thread.sleep(5000);
    	logger.info("I should see a password reset form with a field for email");
   
    }

    @Then("I should be able to request a password reset link after entering my email and clicking on the continue button")
    public void i_should_be_able_to_request_a_password_reset_link_after_entering_my_email_and_clicking_on_the_continue_button() {
    	validloginpage.continueagain();
   
}
    @Given("User should be logged out")
	public void user_should_be_logged_out() {
	   logger.info("user is logged out");
	}


}
