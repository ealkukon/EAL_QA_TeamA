package com.pdl.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class SearchCatagoryPage extends CommonMethods {
	
	WebDriver driver = Driver.getDriver();
	Searchpage validkeyword=new Searchpage();
	// pagefactory constructor
	
	public SearchCatagoryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	@FindBy(css="#input-search")// needs tp fix
	public WebElement keyword_searchcriteria;
	
	@FindBy(xpath="//select[@name='category_id']")////*[@id="content"]/div/div[2]/select
    public WebElement categorydropdown;
	
	
	public void searchpage() {
		   String pageTitle = driver.getTitle();
		   
		// Verify the title
		    try {
		        Assert.assertEquals(pageTitle, "Search");
		        System.out.println("Title matches");
		    } catch (AssertionError e) {
		        System.out.println("Title does not match");
		        logger.info("logging should be successful and directed to the search Page");
		        throw e;  // Re-throw the assertion error to ensure the test fails
		    }
		}
			
			// Verify the title
		    /*if(pageTitle.equals("Search")) {
		        System.out.println("Title matches");
		    } else {
		        System.out.println("Title does not match");
		        logger.info("logging should be successful and directed to the search Page");
		    }*/
	//}
	
	public void Enterkeyword() {
		keyword_searchcriteria.clear();
		keyword_searchcriteria.sendKeys("Mac");
		//keyword_searchcriteria.sendKeys("phone");
	}
	
	public void dropdownclick() {
		categorydropdown.click();
		
	}
	public void catagoryselection() {
		CommonMethods.selectFromDropDownbyValue( categorydropdown, "20");
		categorydropdown.click();
	}

	}
	

	
	
	

