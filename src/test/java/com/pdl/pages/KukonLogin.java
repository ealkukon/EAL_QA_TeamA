package com.pdl.pages;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.ConfigurationReader;
import com.pdl.utilities.Driver;

public class KukonLogin extends CommonMethods {
	


	//1.constructor
	public KukonLogin() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//2.Login Locators
	@FindBy(name="email")
	public WebElement emailaddress;
	
	@FindBy(name="password")
	public WebElement userpassword;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	public WebElement loginTab;
	

	//Unsuccessful login locators 
	@FindBy(name="email")
	public WebElement invalidemailaddress;
		
	@FindBy(name="password")
	public WebElement invaliduserpassword;
		
	@FindBy(xpath="//*[@type=\"submit\"]")
	public WebElement invalidloginTab;
		
	
	//forgotten password Locator
	@FindBy(linkText="Forgotten Password")
	public WebElement forgetpass;
		
	@FindBy(name="email")
	public WebElement emailbtm;
			
	@FindBy(xpath="//*[@value=\"Continue\"]")
    public WebElement continuebtm;
	

	//3.Action methods valid login
	public void emaillogin() {
		emailaddress.clear();
		emailaddress.sendKeys(ConfigurationReader.getProperty("username"));
	}
	public void passwordenter() {
		userpassword.clear();
		userpassword.sendKeys(ConfigurationReader.getProperty("password"));
	}
	public void loginbutton() {
		loginTab.click();
	}
	
	//3.Action methods unsuccessful login
	public void invalidemaillogin() {
		invalidemailaddress.clear();
		invalidemailaddress.sendKeys(ConfigurationReader.getProperty("invalidusername"));
	}
	public void invalidpasswordenter() {
		invaliduserpassword.clear();
		invaliduserpassword.sendKeys(ConfigurationReader.getProperty("invalidpassword"));
	}
	public void invalidloginbutton() {
		invalidloginTab.click();
	}
	
	
	//3.Action methods forgotten password
	public void forgetpassword() {
	forgetpass.click();
	}
	public void emailagain() {
		emailbtm.clear();
		emailbtm.sendKeys(ConfigurationReader.getProperty("username"));
	}
	public void continueagain() {
		continuebtm.click();
	}
	public static String getMyAccount() {
		String getMyAccount=driver.getCurrentUrl();
		return getMyAccount;
		}
	
	}		
	
	
	
	
		
	


		
