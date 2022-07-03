package com.umeshStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.umeshStore.base.BaseClass;

import Action.java.Action;

public class AddToCartPage extends BaseClass {

	//xpath="//span[text()="Add to cart"]"
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2//i")
	WebElement cartVerification;
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(name="group_1")
	WebElement size;
	
	@FindBy(name="Submit")
	WebElement addToCart;
	
	@FindBy(xpath="//span[contains(text(),\"Proceed to checkout\")]")
	WebElement proceedToCheck;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity(String quantity_size) throws Throwable {
		Action.type(quantity, quantity_size);
	}
	
	public void enterSize(String input_size) throws Throwable{
		Action.selectByVisibleText(input_size, size);
	}
	
	public void clickOnAddToCart() throws Throwable {
		Action.click(driver, addToCart);
		
	}
	
	public boolean AddCartVerification() throws Throwable {
		return  Action.isDisplayed(driver, cartVerification);
	}
	
	public void ProceedToCheck() throws Throwable{
		Action.JSClick(driver, proceedToCheck);
		
	}
	

	
	
	
	
	
	
	
}
