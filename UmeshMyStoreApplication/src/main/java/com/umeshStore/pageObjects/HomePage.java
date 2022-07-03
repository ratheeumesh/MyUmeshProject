package com.umeshStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.umeshStore.base.BaseClass;

import Action.java.Action;

public class HomePage extends BaseClass{

	@FindBy(xpath="//i[@class=\"icon-list-ol\"]")
	WebElement orderHistoryDetails;
	
	@FindBy(xpath="//i[@class=\"icon-heart\"]")
	WebElement myWishlist;
	
	@FindBy()
	WebElement myCreditTips;
	
	@FindBy()
	WebElement myAddress;
	
	
	public HomePage() {
//		PageFactory.initElements(driver, this);
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateMyWishList() {
		return  Action.isDisplayed(getDriver(), myWishlist);
		
	}
	
	public boolean validateMyOrderList() {
		return   Action.isDisplayed(getDriver(), orderHistoryDetails);
		
	}
	
	
	
}
