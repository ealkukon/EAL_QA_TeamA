package com.pdl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;

public class KcCheckoutPage extends CommonMethods {

	public static Logger logger = LogManager.getLogger(KcCheckoutPage.class);
	
	
	//constructor
	
	public KcCheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	//locator
	
	@FindBy(xpath = "//span[text()='Shopping Cart']") public WebElement shoppingcartbtn; 

	@FindBy (xpath = "//div[@class='pull-right']/a") public WebElement checkoutbtn;
	@FindBy(xpath = "//nav[@id='menu']/div[2]") public WebElement stock;


	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") public WebElement outstockmsg;
	@FindBy(xpath = "//span[@class='text-danger']") public WebElement outstockstars;
	@FindBy(css = "((//td[@class='text-left'])[11]") public WebElement Productnameinshopcart;


	
	
    
	
	
	//3.action method
	
		public void click_ShoppingCart() { 
			isElementDisplayed(shoppingcartbtn);
			drawborder(shoppingcartbtn);
			shoppingcartbtn.click();
		}
	
	  public void click_checkout() {
		  isElementDisplayed(checkoutbtn);
		  drawborder(checkoutbtn);
		checkoutbtn.click();
	}
	  public void checkoutbtnclickable() throws InterruptedException {
		  hover(checkoutbtn);
		  Thread.sleep(3000);
		  waitAndClick(checkoutbtn);

	  }
	  public void outstockalertmsg() {
		 
		isElementDisplayed(outstockmsg);
		drawborder(outstockmsg);
		isElementDisplayed(outstockstars);
		drawborder(outstockstars);
		
		        	 Assert.assertTrue("Products are not in stock!",outstockmsg.isEnabled());
		     
		        System.out.println(outstockmsg);
		    }
	  public void outstockmsgs() {
	  String stockStatus = stock.getText();	
		// Check if the product is in stock
	      if (stockStatus.equalsIgnoreCase("In Stock")) {
	          Assert.assertTrue("I should see an option to check out as a guest", checkoutbtn.isEnabled());
	      } else {
	          Assert.assertFalse("The checkout button is disabled", checkoutbtn.isEnabled());
	      }}
	 
		        }
	  

		

