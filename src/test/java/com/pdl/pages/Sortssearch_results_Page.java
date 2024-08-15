package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class Sortssearch_results_Page extends CommonMethods {
	WebDriver driver = Driver.getDriver();
	
	
	Searchpage validkeyword=new Searchpage();
	// pagefactory constructor
	
	public Sortssearch_results_Page () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		
		 @FindBy(xpath="//select[@id='input-sort']")//input-sort is the sorting default element
		    public WebElement sortByDropdown;
		 
		
		 
		 public void sort_drop_down() {
			 sortByDropdown.click();
			 //CommonMethods.jsclick(driver, sortByDropdown);
		 }
		 
		 public void selectSortOption(String option) {//call the method from Commonmethods
			CommonMethods.selectFromDropDownbyVisibleText( sortByDropdown,option);
			sortByDropdown.click();
			CommonMethods.jsclick(driver, sortByDropdown);		
					
		 }			
		 
	 }	


