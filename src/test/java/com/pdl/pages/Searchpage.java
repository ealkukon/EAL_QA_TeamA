package com.pdl.pages;

import java.util.List;
import static org.testng.Assert.assertEquals;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class Searchpage extends CommonMethods {
	
	
	WebDriver driver = Driver.getDriver();
	// pagefactory constructor
	public Searchpage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	// valid keyword search locators
	@FindBy(xpath="//input[@type='text']")//done
	public WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	public WebElement searchbtn;
   
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div[1]/a/img")
	public List<WebElement> productImages;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")
	public  List<WebElement> productNames;;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/p[2]")
	public List<WebElement> productPrices;
	
	//for phone/**/
	@FindBy(xpath="//img[@title='iPhone']")
	public List<WebElement> phoneimage;
	
	@FindBy(xpath="//a[text()='iPhone']")//a[text()='iPhone']
	public List<WebElement> phonename;
	
	@FindBy(xpath="//p[@class='price']")
	public List<WebElement> phoneprice;

	public void search_box() {
		
		isElementDisplayed(searchbox);;
		Assert.assertTrue("searchbox should display", searchbox.isDisplayed());
       }
   public void validatekeyword() {
	   searchbox.clear();
       searchbox.sendKeys("Mac");
       //searchbox.sendKeys("PHONE");
	 
   }
	public void searchbtn() {
		searchbtn.click();
	}

	
	public void verifySearchResults() {
		 
		for (WebElement productName : productNames) {//productNames is the WebElement//
            Assert.assertTrue(productName.isDisplayed());
        }
        for (WebElement productImage : productImages) {//same here
            Assert.assertTrue(productImage.isDisplayed());
        }
        for (WebElement productPrice : productPrices) {//same here
            Assert.assertTrue(productPrice.isDisplayed());
        }
	}
}     /*
      for (WebElement Phone :phonename) {//productNames is the WebElement//
            Assert.assertTrue(Phone.isDisplayed());
        }
        for (WebElement Pimage : phoneimage) {//same here
            Assert.assertTrue(Pimage.isDisplayed());
        }
        for (WebElement PPrice : phoneprice) {//same here
            Assert.assertTrue(PPrice.isDisplayed());
        }
    }
   */
		
	




	
	
	