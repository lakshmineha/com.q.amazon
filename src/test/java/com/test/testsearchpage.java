package com.test;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.pages.searchproductresultpage;

@Test
public class testsearchpage extends BaseTest {
	
	public void  testsearchbox()
	{logger = report.createTest(" test searchbox");
		searchproductresultpage resultpage=	search.searchdropdownbox("iphone 13");
		logger.pass("search the product in dropdownbox ");
		
		boolean result=resultpage.isdisplayproduct();
		Assert.assertTrue(result);
		logger.pass("verify the product");
		System.out.println(result);
	}

	
}
