package com.org.flipkart.filpkart;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductDetailsPage 
{
	WebDriver driver;
	public final static Logger log = Logger.getLogger(ProductDetailsPage.class.getName());
	
	public final String RedmiNote5ProGold= "Redmi Note 5 Pro (Gold, 64 GB)";
	public final String RedmiNote5Black= "Redmi Note 5 (Black, 64 GB)";
	public final String RedmiNote4Dark= "Redmi Note 4 (Dark Grey, 64 GB)";
	public final String flower_print_jeans = "Flower print jeans";
	
	
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]")
	List<WebElement> products;

	public ProductDetailsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectProduct(String product) {
		System.out.println("driver:-"+driver);
		driver.findElement(By.xpath("//div[contains(text(),'"+product+"')]")).click();
		log.info(product+" has beel selected");
	}
	
	public List<WebElement> selectProduct(){
		List<WebElement> element = products;
		return element;
	}
}
