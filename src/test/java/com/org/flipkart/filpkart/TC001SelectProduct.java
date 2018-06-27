package com.org.flipkart.filpkart;

import org.testng.annotations.Test;

import com.org.flipkart.testBase.TestBase;

public class TC001SelectProduct extends TestBase
{
	
	
	@Test
	public void selectCategoryType() throws InterruptedException
	{
		log.info("Started select Category Type");
		SelectSubCategory ssct=new SelectSubCategory(driver);
		ssct.selectCategoryType(ssct.men, ssct.Kurtas);
		log.info("Finshed select Category Type");
		log.info("Started Filter Price,brand,size and color");
		MenCategoryFilters mcf=new MenCategoryFilters(driver);
		mcf.priceFilter();
		mcf.brandFilter(mcf.peterEngland);
		mcf.sizeFilter(mcf.M);
		mcf.colorFilter(mcf.Blue);
		log.info("Finshed Price,brand,size and color");
		log.info("Started select product Name");
		SelectPoductPage spp=new SelectPoductPage(driver);
		spp.selectPoductPage(spp.peterEnglandTextured);
		getScreenShot("products");
		log.info("Finshed select product Name");
	}
	
}
