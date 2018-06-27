package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCategoryType 
{
	public final String electronics = "Electronics";
	public final String tvsAndAppliances = "TVs & Appliances";
	public final String men = "Men";
	public final String women = "Women";
	public final String babyAndKids = "Baby & Kids";
	public final String homeAndFurniture = "Home & Furniture";
	public final String sportsBooksAndMore = "Sports, Books & More";
	public final String offerZone = "Offer Zone";

	private final static Logger log = Logger.getLogger(SelectCategoryType.class.getName());
	WebDriver driver;

	public SelectCategoryType(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement closeLoginPopUp;
	
	
	public void selectCategoryType(String categoryName) throws InterruptedException
	{
		
		
		log.info("test");
		closeLoginPopUp.click();
		log.info("Close Login Popup");
		 Thread.sleep(7000);
	    WebElement categoryType=driver.findElement(By.xpath(".//span[text()='Women']"));
		Actions action=new Actions(driver);
		action.moveToElement(categoryType).build().perform();
		log.info("mouse move on "+categoryName+" and object is "+ categoryType.toString());
	    categoryType.click();
	}

}
