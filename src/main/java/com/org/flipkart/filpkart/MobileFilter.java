package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobileFilter 
{
	public final String lessTjan512MB = "Less than 512 MB";
	public final String oneGB = "1 GB";
	public final String twoGB = "2 GB";
	public final String threeGB = "3 GB";
	public final String fourGB = "4 GB";
	public final String sixGBAndAbove = "6 GB & Above";
	
	
	public final String mi = "MI";
	public final String samsung = "Samsung";
	public final String apple = "Apple";
	public final String micromax = "Micromax";
	
	
	private final static Logger log = Logger.getLogger(MobileFilter.class.getName());
	WebDriver driver;

	public MobileFilter(WebDriver driver) 
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
	
	public void priceFilter() throws InterruptedException
	{
		Thread.sleep(7000);
		Select	selectMinPrice=new Select(minPrice);
		selectMinPrice.selectByIndex(1);
		log.info("select minmum price "+minPrice+" ");
		Select selectMaximumPrice=new Select(maximPrice);
		selectMaximumPrice.selectByIndex(3);
	}
	public void ramFilter(String ram) throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement ramStorage=driver.findElement(By.xpath(".//div[text()='"+ram+"']/preceding-sibling::div"));
		ramStorage.click();
		log.info("select minmum price "+ram+" and Object is "+ramStorage.toString());
		System.out.println(ramStorage.isDisplayed());
		System.out.println(ramStorage.isEnabled());		

		
	}
	public void brandFilter(String brandName) throws InterruptedException
	{
		Thread.sleep(7000);
		searchBrand.sendKeys(brandName);
		log.info("select brand Name "+brandName+"  and Object is "+searchBrand.toString());
		WebElement selectBrand=driver.findElement(By.xpath(".//div[text()='"+brandName+"']/preceding-sibling::div"));
		selectBrand.click();
		log.info("select brand Name "+brandName+"  and Object is "+selectBrand.toString());
		System.out.println(selectBrand.isDisplayed());
		System.out.println(selectBrand.isEnabled());			
		
	}
	
	
}
