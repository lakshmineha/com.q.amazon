package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Driverscript;

public class searchproductresultpage extends Driverscript {
	
	
 
	@FindBy(xpath="(//div[@class='aok-relative'])[1]") WebElement productresult;
	 
	
	public searchproductresultpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public boolean isdisplayproduct()
	{ return productresult.isDisplayed();   
	
	
	}
	public addtocard clickproductresult()
	{
		productresult.click();
		return new addtocard();
	}

	
	
	
}
