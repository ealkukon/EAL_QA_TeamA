package com.pdl.pages;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;



public class KcAddToCartPage extends CommonMethods{
	
	public static Logger logger = LogManager.getLogger(KcAddToCartPage.class);
	
	//1.constructor
	public KcAddToCartPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	//2.locators
	@FindBy(xpath = "(//span[@class=\"hidden-xs hidden-sm hidden-md\"])[7]")
	public WebElement AddtoCartbtn;
	
	@FindBy(xpath="(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	public WebElement AddtoCartbtn2;
	
	@FindBy(xpath="(//span[@class='hidden-xs hidden-sm hidden-md'])[9]")
	public WebElement AddtoCartbtn3; 
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	public WebElement AlertMessage;
	
	@FindBy(id="cart-total") public WebElement TotalItems;
	
	@FindBy(css = "td.text-left>a") public WebElement Productname;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
	public WebElement productimage;
	
    
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/p[2]")
    public WebElement productprice;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']") public WebElement shoppingcartbtn;
	
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]")
    public WebElement removebtn;
    
  @FindBy(xpath = "//*[@id=\"checkout-cart\"]/div[1]") public WebElement outstockmsg;
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]") public WebElement stock;
    
    
	//3.action method
    
    public void select_Productimage() {
		scrollToElement(productimage);
		isElementDisplayed(productimage);
	 
     }

	public void click_AddtoCart() throws InterruptedException { 
		scrollToElement(AddtoCartbtn);
		AddtoCartbtn.click();
		Thread.sleep(2000);
	}	
	public void addtocartexiste() {
			isElementDisplayed(AddtoCartbtn);
			drawborder(AddtoCartbtn);
			AddtoCartbtn.click();
			
	}
	
	 
	  public void validateCart() {
		 //   boolean isButtonEnabled = AddtoCartbtn.isEnabled();
		 //  assertTrue(isButtonEnabled, "Add to Cart button should be enabled only if the product is in stock.");
		  // Retrieve the stock status text
          String stockStatus = stock.getText();	
	// Check if the product is in stock
      if (stockStatus.equalsIgnoreCase("In Stock")) {
          // Assert that the "Add to Cart" button is enabled
          Assert.assertTrue("The 'Add to Cart' button should be enabled", AddtoCartbtn.isEnabled());
      } else {
          // Assert that the "Add to Cart" button is disabled
          Assert.assertFalse("The 'Add to Cart' button should be disabled", AddtoCartbtn.isEnabled());
      }}
	 
	
	public void confirmationtmsg() {
	    isElementDisplayed(AlertMessage);
		drawborder(AlertMessage);
		
	}
	public void confirmmsgdetails() throws InterruptedException{
		isElementDisplayed(AlertMessage);
		drawborder(AlertMessage);
		Thread.sleep(2000);
		isElementDisplayed(Productname);
		drawborder(Productname);
		Thread.sleep(3000);
		isElementDisplayed(productimage);
		drawborder(productimage);
		Thread.sleep(2000);
		isElementDisplayed(productprice);
		drawborder(productprice);
	}
		
		
	/*
	 * public void confirm() { String productName = Productname.getText(); String
	 * productImageSrc = productimage.getAttribute("src"); String productPrice =
	 * productprice.getText();
	 * 
	 * String confirmationMessage = "Product: " + productName + "\nImage URL: " +
	 * productImageSrc + "\nPrice: " + productPrice;
	 * System.out.println(confirmationMessage); }
	 */
	
	public void itemsconfirmation() {
		isElementDisplayed(TotalItems);
		drawborder(TotalItems);
	}
	
	
	

	public void hoverover() throws InterruptedException {
		hover(AddtoCartbtn); 
	}

	public void redborders() { 
		// Retrieve the border color after hover
        String borderColor = AddtoCartbtn.getCssValue("border-color");
        
        // Define the expected color (for example, in RGB format)
        String expectedColor = "rgb(255, 0, 0)"; // Red
        
     // Assert that the border color is red
        Assert.assertEquals("The border color is not red", expectedColor, borderColor);

    }
	
	
	public void click_multipleproducts() throws InterruptedException {

			scrollToElement(AddtoCartbtn);
			AddtoCartbtn.click();
			Thread.sleep(3000);
			AddtoCartbtn2.click();
			Thread.sleep(3000);
			AddtoCartbtn3.click();
			Thread.sleep(3000);
	}
	
	public void click_remove() { 
		shoppingcartbtn.click();
		isElementDisplayed(removebtn);
		drawborder(removebtn);
		removebtn.click();
	}

}


		

			
	
	
	
	
	
	



