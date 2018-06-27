package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectSubCategory 
{
	public final String electronics = "Electronics";
	public final String men = "Men";
	public final String women = "Women";
	
	
	public final String Kurtas = "Kurtas";
	public final String footwear = "MI";
	public final String clothing = "Clothing";

	private final static Logger log = Logger.getLogger(SelectSubCategory.class.getName());
	WebDriver driver;

	public SelectSubCategory(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement closeLoginPopUp;
	
	
	
	public void selectCategoryType(String categoryName,String subCategoryName) throws InterruptedException
	{
		closeLoginPopUp.click();
		log.info("Close Login Popup");
		Thread.sleep(7000);
		
		while(true)
		{
			try {
				WebElement categoryType=driver.findElement(By.xpath("//a[@title='"+categoryName+"']"));
				Actions action=new Actions(driver);
				action.moveToElement(categoryType).build().perform();
				categoryType.isDisplayed();
				categoryType.click();
				Thread.sleep(7000);
				WebElement subCategoryType=driver.findElement(By.xpath(".//a[@title='"+categoryName+"']/following-sibling::ul/li/ul/li/ul/li/a/span[text()='"+subCategoryName+"']"));
				subCategoryType.click();
				subCategoryType.isDisplayed();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
			}
		}
	}
	

}
