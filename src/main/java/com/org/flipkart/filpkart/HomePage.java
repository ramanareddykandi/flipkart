package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage 
{
	public final String electronics = "Electronics";
	public final String tvsAndAppliances = "TVs & Appliances";
	public final String men = "Men";
	public final String women = "Women";
	public final String BabyAndKids = "Baby & Kids";
	public final String homeandFurniture = "Home & Furniture";
	public final String sportsBooksandMore = "Sports, Books & More";
	public final String offerZone = "Offer Zone";
	
	public final String mobile = "Mobiles";
	public final String television = "Television";
	public final String footwear = "footwear";
	public final String clothing = "Clothing";
	public final String kitchenAndDining = "Kitchen & Dining";
	public final String books = "Books";
	
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	
	WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement closeLoginPopUp;
	
	public void clickOnNavigationMenu(String menuName,String subMenuSection) throws InterruptedException
	{
		//closeLoginPopUp.click();
		log.info("Close Login Popup");
		Thread.sleep(7000);
		
		while(true)
		{
			try {
				WebElement categoryType=driver.findElement(By.xpath("//a[@title='"+menuName+"']"));
				
				Actions action=new Actions(driver);
				action.moveToElement(categoryType).build().perform();
				
				categoryType.isDisplayed();
				categoryType.click();
				Thread.sleep(7000);
				WebElement subCategoryType=driver.findElement(By.xpath(".//a[@title='"+menuName+"']/following-sibling::ul/li/ul/li/ul/li/a/span[text()='"+subMenuSection+"']"));
				subCategoryType.click();
				subCategoryType.isDisplayed();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
			}
		}
	
	}	
}

