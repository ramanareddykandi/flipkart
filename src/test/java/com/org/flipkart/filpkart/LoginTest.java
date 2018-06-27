package com.org.flipkart.filpkart;

import org.testng.annotations.Test;

import com.org.flipkart.testBase.TestBase;

public class LoginTest extends TestBase
{
	LoginPage loginPage;
	@Test
	public void loginTest() 
	{
			log.info("=======Login Test Class========");
			loginPage=new LoginPage(driver);
			loginPage.loginPage(OR.getProperty("username"), OR.getProperty("password"));
			log.info("=======Logout Test Class========");
	}
}
