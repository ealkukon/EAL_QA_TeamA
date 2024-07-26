package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class Invalidsearchpage  extends CommonMethods{
	
	WebDriver driver = Driver.getDriver();
	
	// pagefactory constructor
	public Invalidsearchpage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
    // invalid search locators
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	public WebElement invalidword;
	
	@FindBy(css="#content")
	public WebElement productdisplay;
	
	
	@FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")
	public WebElement message;
	
	 public void enterinvalidword() {
	   invalidword.clear();
	   invalidword.sendKeys("Maca");
  }
  
	 public void messagedisplay() {
	  message.isDisplayed();
  }

   public void noproductcontent() {
	   productdisplay.isDisplayed();
	  
  }
  
}



  
