package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddToCartPage 
{
	public final static Logger log = Logger.getLogger(AddToCartPage.class.getName());
	WebDriver driver;


	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//*[text()='ADD TO CART']/parent::li")
	WebElement addToCart;
	
	
	@FindBy(xpath = "//*[text()='Place Order']")
	WebElement placeOrder;

	public void addToCartPage()
	{
		addToCart.click();
	}
	public void placeOrderPage()
	{
		placeOrder.click();
	}
	
}
