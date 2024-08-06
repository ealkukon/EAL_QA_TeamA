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
	
	@FindBy(xpath = "//*[@id=\"cart\"]/button") public WebElement CartIcon;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul") public WebElement sammary;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[1]/a/img") public WebElement image;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[2]/a") public WebElement name;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[3]") public WebElement quantity;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[4]") public WebElement price;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[1]/td[1]/strong") public WebElement subtotal;
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[4]/td[1]/strong") public WebElement total;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']") public WebElement shoppingcartbtn;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/input") public WebElement EditQuantity;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[1]/i") public WebElement refreshbtn;



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
	public void changeQuantity() {
		EditQuantity.clear();
		EditQuantity.sendKeys("2");
		
		
	}
	
	public void refresh() {
		refreshbtn.click();
	}
	
}
