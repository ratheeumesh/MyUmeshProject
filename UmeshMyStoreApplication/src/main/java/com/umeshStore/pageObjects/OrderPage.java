package com.umeshStore.pageObjects;

public class OrderPage {

	
	// Here after getting the price we need to remove all the special character:
	// i.e 
	public String unit_price= "$23423";
	unit_price= unit_price.replaceAll("[^a-zA-Z0-9]","");
	// take it's input in double
	double price= Double.parseDouble(unit_price);
	
	  
}
