package com.org.flipkart.addToCart;

import org.testng.annotations.Test;

import com.org.flipkart.filpkart.HomePage;
import com.org.flipkart.filpkart.LoginPage;
import com.org.flipkart.filpkart.MobileFilter;
import com.org.flipkart.filpkart.ProductDetailsPage;
import com.org.flipkart.testBase.TestBase;


public class TC001_VerifyAaddToCart extends TestBase
{
	LoginPage loginPage;
	HomePage homepage;
	MobileFilter mobileFilter;
	ProductDetailsPage productDetailsPage;
	@Test
	public void verifyAaddToCart() {
		try {
			log.info("=======Starting verifyAaddToCart test========");
			loginPage=new LoginPage(driver);
			loginPage.loginPage(OR.getProperty("username"), OR.getProperty("password"));
			homepage = new  HomePage(driver);
			homepage.clickOnNavigationMenu(homepage.electronics, homepage.mobile); 
			mobileFilter.priceFilter();
			mobileFilter.brandFilter(mobileFilter.mi);
			mobileFilter.ramFilter(mobileFilter.twoGB);
			productDetailsPage.selectProduct(productDetailsPage.RedmiNote5ProGold);
			
			log.info("=======Finished verifyAaddToCart test========");
			getScreenShot("verifyAaddToCart");
		} catch (Exception e) {
           getScreenShot("verifyAaddToCart");
		}
	}
}
