package com.org.flipkart.filpkart;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MenCategoryFilters 
{
	
	public final String peterEngland = "Peter England";
	public final String britishTerminal = "British Terminal";
	public final String ada = "Ada";
	
	
	public final String M = "M";
	public final String S = "S";
	public final String L = "L";
	
	public final String Blue = "Blue";
	public final String Black = "Black";
	
	private final static Logger log = Logger.getLogger(MenCategoryFilters.class.getName());
	WebDriver driver;

	public MenCategoryFilters(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//section[2]/div[4]/div[1]/select")
	WebElement minPrice;
	
	@FindBy(xpath=".//section[2]/div[4]/div[3]/select")
	WebElement maximPrice;
	
	@FindBy(xpath=".//div[contains(text(),'British Terminal')]/preceding-sibling::div")
	WebElement selectBrand;
	
	
	
	public void priceFilter() throws InterruptedException
	{
		Thread.sleep(7000);
		Select	selectMinPrice=new Select(minPrice);
		selectMinPrice.selectByIndex(1);
		log.info("select minmum price "+minPrice+" ");
		Select selectMaximumPrice=new Select(maximPrice);
		selectMaximumPrice.selectByIndex(3);
	}
	public void brandFilter(String brandName) throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement selectBrand=driver.findElement(By.xpath(".//div[text()='"+brandName+"']/preceding-sibling::div"));
		selectBrand.click();
		log.info("select brand Name "+brandName+"  and Object is "+selectBrand.toString());
		System.out.println(selectBrand.isDisplayed());
		System.out.println(selectBrand.isEnabled());			
		
	}
	public void sizeFilter(String size) throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement selectSize=driver.findElement(By.xpath(".//div[text()='"+size+"']/preceding-sibling::div"));
		selectSize.click();
		log.info("select Size "+size+" and Object is "+selectSize.toString());
		System.out.println(selectSize.isDisplayed());
		System.out.println(selectSize.isEnabled());		

		
	}
	public void colorFilter(String color) throws InterruptedException
	{
		Thread.sleep(7000);
		WebElement selectColor=driver.findElement(By.xpath(".//div[text()='"+color+"']/../div"));
		log.info("select Color "+color+" and Object is "+selectColor.toString());
		System.out.println(selectColor.isDisplayed());
		System.out.println(selectColor.isEnabled());
		
	}
	
}
