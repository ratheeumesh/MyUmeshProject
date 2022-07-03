package com.umeshStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.umeshStore.base.BaseClass;

import Action.java.Action;

public class AccountCreationPage extends BaseClass {
	
	@FindBy(xpath="//h1[text()=\"Create an account\"] ")
	WebElement createAccount;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void validateAccountCreatePage() {
		Action.isDisplayed(driver, createAccount);
	}
}
