package com.pdl.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
	@FindBy(xpath = "(//span[@class=\"hidden-xs hidden-sm hidden-md\"])[7]") public WebElement AddtoCartbtn;

	@FindBy(xpath = "//span[text()='Shopping Cart']") public WebElement shoppingcartbtn; 


    @FindBy(xpath = "//a[text()='Checkout']") public WebElement checkoutbtn;
	
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") public WebElement myaccount;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a") public WebElement myaccountbtn;
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[4]") public WebElement addressbookbtn;
    @FindBy(xpath = "//*[@id=\"content\"]") public WebElement addressbookentries;
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[2]/a[1]") public WebElement editbtn;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input") public WebElement continuebtn;
	@FindBy(xpath = "//*[@id=\"account-address\"]/div[1]") public WebElement updatedmsg;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/a") public WebElement addadressbtn;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset")public WebElement addadress;
	@FindBy(xpath = "//*[@id=\"input-firstname\"]") public WebElement firstname;
	@FindBy(xpath = "//*[@id=\"input-lastname\"]") public WebElement lastname;
	@FindBy(xpath = "//*[@id=\"input-address-1\"]") public WebElement address;
	@FindBy(xpath = "//*[@id=\"input-city\"]") public WebElement city;
	@FindBy(xpath = "//*[@id=\"input-postcode\"]") public WebElement postcode;
	@FindBy(xpath = "//*[@id=\"input-country\"]") public WebElement country;
	@FindBy(xpath = "//*[@id=\"input-zone\"]") public WebElement state;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input") public WebElement defautlNo;
	@FindBy(xpath = "//*[@id=\"account-address\"]/div[1]")public WebElement successfulyaddedmsg;
	
	
	//3.action method
	
		public void click_ShoppingCart() { 
			shoppingcartbtn.click();
		}
	
	  public void click_checkout() {
		checkoutbtn.click();
	}
	  public void checkoutbtnclickable() throws InterruptedException {
		  hover(checkoutbtn);
		  Thread.sleep(3000);
		  waitAndClick(checkoutbtn);

	  }
	public void click_myaccount() throws InterruptedException {
		myaccount.click();
		Thread.sleep(20000);
		myaccountbtn.click();
		//myaccountbtn.click();
	}
	public void addressbook() throws InterruptedException {
		addressbookbtn.click();
		Thread.sleep(3000);
		addressbookentries.isDisplayed();
		Thread.sleep(3000);
	}
	public void click_edit() throws InterruptedException {
		editbtn.click();
		Thread.sleep(3000);
		firstname.clear();
		firstname.sendKeys("urm");
		Thread.sleep(3000);
		scrollToElement(continuebtn);
		Thread.sleep(3000);
		continuebtn.click();	
		}
	
	public void displayedupdatedmsg() {
		isElementDisplayed(updatedmsg);
		drawborder(updatedmsg);}

	public void addaddress() throws InterruptedException {
		addadressbtn.click();
		Thread.sleep(10000);
		addadressbtn.click();
		isDisplayedBoolean(addadress);
		Thread.sleep(3000);
	}
	public void completeinfo() throws InterruptedException {
		firstname.clear();
		firstname.sendKeys("kathy");
		Thread.sleep(3000);
		lastname.clear();
		lastname.sendKeys("cheb");
		Thread.sleep(3000);
		address.clear();
		address.sendKeys("3452 allesley");
		Thread.sleep(3000);
		city.clear();
		city.sendKeys("westfield");
		Thread.sleep(3000);
		postcode.clear();
		postcode.sendKeys("12345");
		Thread.sleep(3000);
		
	}
		
		public void selectcountry () throws InterruptedException {
			country.click();
	    	Thread.sleep(3000);
			CommonMethods.selectFromDropDownbyVisibleText(country, "United States");
			Thread.sleep(3000);
		}
	
		public void selectstate() throws InterruptedException {
			state.click();
		Thread.sleep(3000);
		CommonMethods.selectFromDropDownbyVisibleText(state, "Illinois");
		Thread.sleep(3000);		
	}
		public void addressdefault() throws InterruptedException {
			defautlNo.click();
			Thread.sleep(3000);	
			continuebtn.click();
			
		}
		public void displayedsuccessfullyaddedmsg() {
			isElementDisplayed(successfulyaddedmsg);
			drawborder(successfulyaddedmsg);
			}
		
}
