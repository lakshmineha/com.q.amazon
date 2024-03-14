package com.test;

import java.io.IOException;

import org.testng.ITestResult;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.base.Driverscript;
import com.pages.Homepage;
import com.pages.addtocard;
//import com.pages.Homepage;
import com.pages.searchpage;
import com.pages.searchproductresultpage;
import com.utils.helper;

public class BaseTest  extends Driverscript{
	
	
	
	
	protected static ExtentReports report;
	protected static ExtentTest logger;
	Homepage homepage;
	searchpage search;
	searchproductresultpage resultpage; 
	addtocard card;
	
	@BeforeSuite
	public void setUpReport() 
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./reports/wsreport"+System.currentTimeMillis()+".html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeMethod
	public void setUp()
	{
		setup();
		homepage=new Homepage();
		search=new searchpage();
	resultpage	=new searchproductresultpage();
	
		card=new addtocard();
		

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try {
				logger.fail("Test Failed",
						MediaEntityBuilder.createScreenCaptureFromPath(helper.captureScreen(driver)).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		report.flush();
		quitDrive();
	}
}






 






