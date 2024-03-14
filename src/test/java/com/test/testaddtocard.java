package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.searchproductresultpage;



public class testaddtocard extends BaseTest{
	
@Test
	public void addtocardpagetest() throws InterruptedException
	{
	logger = report.createTest(" test Validating addtocardpage");
	 searchproductresultpage resultpage=	search.searchdropdownbox("iphone 13");
	 logger.pass("search the product");
		card=resultpage.clickproductresult();
		logger.pass("clicked on product result");
		driver.navigate().forward();
		logger.pass("navigate  forward page");
		boolean result=card.validatecard();
		
		Assert.assertTrue(result);
		logger.pass("validatecard verified");
		
		
		
	}
	
	
	
	
}
