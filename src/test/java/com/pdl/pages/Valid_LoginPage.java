package com.pdl.pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.ConfigurationReader;
import com.pdl.utilities.Driver;


public class Valid_LoginPage extends CommonMethods {
	
	WebDriver driver = Driver.getDriver();

	public Valid_LoginPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement emailaddress ;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginbtn;
	
	
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	public WebElement MyAccount;
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[2]")
	public WebElement MyOrders;
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[3]")
	public WebElement MyAffilatelinks;
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[4]")
	public WebElement Newsletter;
	
	
	
	public void emaillogin() {
		
		emailaddress.clear();
		emailaddress.sendKeys(ConfigurationReader.getProperty("userId"));
	}	
		public void passwordenter() {	
		
		password.clear();
		password.sendKeys(ConfigurationReader.getProperty("password"));
		}
		
		public void loginbutton() {
			
			loginbtn.click();
		}
		
		public void alloptions() {
			Assert.assertTrue(MyAccount.isDisplayed());
			Assert.assertTrue( MyOrders.isDisplayed());
			Assert.assertTrue( MyAffilatelinks.isDisplayed());
			Assert.assertTrue( Newsletter.isDisplayed());
		}
	  
}
		/*assertEquals(true, MyAccount.isDisplayed());
		assertEquals(true, MyOrders.isDisplayed());
		assertEquals(true, MyAffilatelinks.isDisplayed());
		assertEquals(true, Newsletter.isDisplayed());
		
	  
  }*/


