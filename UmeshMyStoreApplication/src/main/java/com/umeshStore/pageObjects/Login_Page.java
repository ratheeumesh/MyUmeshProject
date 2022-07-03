package com.umeshStore.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.umeshStore.base.BaseClass;

import Action.java.Action;

public class Login_Page extends BaseClass{

	
	@FindBy(xpath="//a[@class='login']")
	WebElement signInButton;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement imageLogo;
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(name="submit_search")
	WebElement submitButton;
	
	public Login_Page(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(getDriver(),this);
	}
	
	public LoginPage1 clickOnSignin() {
			Action.click(getDriver(),signInButton);
			return new LoginPage1();
	}
	
	public boolean validateLogo() {
		return  Action.isDisplayed(getDriver(), imageLogo);
		
	}
	
	public String getUmeshStoreTitle() {
		String myStoretitle= getDriver().getTitle();
		return myStoretitle;
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchBox,productName);
		Action.click(getDriver(),submitButton);	
		return  new SearchResultPage();
		
	}
	
	
	
	
	
}
