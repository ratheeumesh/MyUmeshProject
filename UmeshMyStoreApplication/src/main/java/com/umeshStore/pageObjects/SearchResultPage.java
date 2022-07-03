/**
 * 
 */
package com.umeshStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.umeshStore.base.BaseClass;

import Action.java.Action;

/**
 * @author umeshrathee
 *
 */
public class SearchResultPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"center_column\"]//img")
	WebElement image_ele;
	
	@FindBy(name="Submit")
	WebElement addToCart;
	
	
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean isProductAvailable() {
		return  Action.isDisplayed(getDriver(), image_ele);
	}
	
	public AddToCartPage clickOnProduct() {
		Action.click(getDriver(), image_ele);
		return  new AddToCartPage();
	}
	
	
}
