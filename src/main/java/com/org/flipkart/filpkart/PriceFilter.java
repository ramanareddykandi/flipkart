package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceFilter 
{


	private final static Logger log = Logger.getLogger(PriceFilter.class.getName());
	WebDriver driver;

	public PriceFilter(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//section[2]/div[4]/div[1]/select")
	WebElement minPrice;
	
	@FindBy(xpath=".//section[2]/div[4]/div[3]/select")
	WebElement maximPrice;
	
	@FindBy(xpath="//input[@placeholder='Search Brand']")
	WebElement searchBrand;
	
	
	@FindBy(xpath="//input[@placeholder='Search Size']")
	WebElement searchSize;
	
	@FindBy(xpath="//input[@placeholder='Search Color']")
	WebElement searchColor;
	
	
	public void priceFilter(String minPrice,String maximPrice)
	{
		Select	selectMinPrice=new Select(this.minPrice);
		selectMinPrice.selectByValue(minPrice);
		log.info("select minmum price "+minPrice+" ");
		Select selectMaximumPrice=new Select(this.maximPrice);
		selectMaximumPrice.selectByValue(maximPrice);
	}
}
