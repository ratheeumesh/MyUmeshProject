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
public class LoginPage1 extends BaseClass {
	
	@FindBy(id="email")
	WebElement emailBox;
	
	@FindBy(id="passwd")
	WebElement passwordBox;
	
	@FindBy(name="SubmitLogin")
	WebElement signInButton;
	
	@FindBy(id="email_create")
	WebElement emailAddressBox;
	
	@FindBy(name="SubmitCreate")
	WebElement createAccntButton;
	
	public LoginPage1() {
//		PageFactory.initElements(driver,this);
		PageFactory.initElements(getDriver(),this);
	}
	
	public HomePage login(String username, String pasword) {
		Action.type(emailBox, username);
		Action.type(passwordBox,pasword);
//		Action.click(driver, signInButton);
		Action.click(getDriver(), signInButton);
		return new HomePage();
		
	}
	
	
	
	
	
	
	

}
