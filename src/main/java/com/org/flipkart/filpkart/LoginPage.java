package com.org.flipkart.filpkart;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.internal.Executable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.flipkart.testBase.TestBase;

public class LoginPage extends TestBase
{
	public final static Logger log = Logger.getLogger(LoginPage.class.getName());
	WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']")
	WebElement emailorMobileNumber;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement loginButton;
	
	public void loginPage(String username,String password)
	{
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(emailorMobileNumber));
		emailorMobileNumber.sendKeys(username);
		log.info("Enter user name:- "+username+"  and Object is "+emailorMobileNumber.toString());
		this.password.sendKeys(password);
		log.info("Enter passowrd:- "+password+"  and Object is "+this.password.toString());
		loginButton.click();
		log.info("Click on login button and Object is "+loginButton.toString());
	}
	
	
}
