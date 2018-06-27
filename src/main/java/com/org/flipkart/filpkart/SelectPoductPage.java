package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectPoductPage
{
	private final static Logger log = Logger.getLogger(SelectSubCategory.class.getName());
	WebDriver driver;
	
	public final String peterEnglandTextured = "Peter England Textured";
	public final String SvanikSelfDesignMenStraightKurta = "Svanik Self Design Men Straight Kurta";

	public SelectPoductPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectPoductPage(String productName)
	{
		WebElement selectProduct = driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]"));
		log.info("select Size "+productName+" and Object is "+selectProduct.toString());
	}
	
}
