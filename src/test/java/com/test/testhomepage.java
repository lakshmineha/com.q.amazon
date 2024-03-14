package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testhomepage extends BaseTest {
	

	@Test(priority = 1)

	public void testhomepagetitle() 
	{   
	logger = report.createTest("Validating HomePage Title");
	String actual=homepage.getHomePageTitle();
	
	logger.pass("got the homepage title");
	Assert.assertTrue(true);
	System.out.println(actual);
	logger.pass("verified homepage title successuflly");
	
	
	
}
@Test(priority = 2)
public void testisdisplayaccountandlist()
{
	logger = report.createTest("Validating accountandlist");
boolean flag=	homepage.isdisplayaccountandlist();
logger.pass("got the isdisplayed ");
Assert.assertTrue(true);
System.out.println(flag);
logger.pass("verified accountandtlistlink");
}
}
