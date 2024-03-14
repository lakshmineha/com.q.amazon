package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Driverscript;

public class Homepage extends Driverscript {
	
	@FindBy(id="nav-logo-sprites") WebElement tittlepage;
	@FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[1]") WebElement accountandlists;
	
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
public boolean isdisplayaccountandlist()
{
	 return accountandlists.isDisplayed();

}
	
	
}
		
		


