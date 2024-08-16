package com.pdl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;

public class KcViewEditShoppingCartPage extends CommonMethods {

public static Logger logger = LogManager.getLogger(KcViewEditShoppingCartPage.class);
	
	//1.constructor
	public KcViewEditShoppingCartPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	//2.locators:
	
	@FindBy(xpath = "//span[@id='cart-total']") public WebElement CartIcon;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul") public WebElement sammary;
	@FindBy(xpath = "//td[@class='text-center']/a/img") public WebElement image;
	@FindBy(xpath = "//td[@class='text-left']/a") public WebElement name;
	@FindBy(xpath = "//td[@class='text-right'] ") public WebElement quantity;
	@FindBy(xpath = "(//td[@class='text-right'] )[2]") public WebElement price;
	
	@FindBy(xpath = "(//td[@class='text-right']/strong)[1]") public WebElement subtotal;
	@FindBy(xpath = "(//td[@class='text-right']/strong)[2]") public WebElement total;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']") public WebElement shoppingcartbtn;

	@FindBy(xpath = "(//input[@type='text'])[2]") public WebElement EditQuantity;
	@FindBy(xpath = "//button[@type='submit']") public WebElement refreshbtn;
    @FindBy(xpath = "(//td[@class='text-right'])[16]") public WebElement updprice;


	//3.action method
	
	public void click_IconCart() {
		CartIcon.click();
	}
	
	public void SeeSammary() throws InterruptedException {
		isElementDisplayed(sammary);
		drawborder(sammary);
		Thread.sleep(2000);
		isElementDisplayed(image);
		drawborder(image);
		Thread.sleep(1000);
		isElementDisplayed(name);
		drawborder(name);
		Thread.sleep(1000);
		isElementDisplayed(quantity);
		drawborder(quantity);
		Thread.sleep(1000);
		isElementDisplayed(price);
		drawborder(price);
		Thread.sleep(1000);
		isElementDisplayed(total);
		drawborder(total);
		Thread.sleep(1000);
	}
	
	public void See_Subtotal() throws InterruptedException {
		isElementDisplayed(subtotal);
		drawborder(subtotal);
		Thread.sleep(1000);
		isElementDisplayed(total);
		drawborder(total);
		Thread.sleep(2000);
	}
	public void click_ShoppingCart() { 
		shoppingcartbtn.click();
	}
	public void changeQuantity() throws InterruptedException {
		EditQuantity.clear();
		Thread.sleep(1000);
		EditQuantity.sendKeys("3");
		
		
	}
	
	public void refresh() throws InterruptedException {
		refreshbtn.click();
		Thread.sleep(3000);
	}
	
	public void updatedprice() throws InterruptedException {
		isElementDisplayed(EditQuantity);
		drawborder(EditQuantity);
		Thread.sleep(1000);
		isElementDisplayed(updprice);
		drawborder(updprice);
		Thread.sleep(1000);
	}
}
