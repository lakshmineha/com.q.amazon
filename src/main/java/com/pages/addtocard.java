package com.pages;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Driverscript;

public class addtocard   extends Driverscript
{

	//@data-testid
	//header/div[@id='navbar']/div[@id='nav-flyout-ewc']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[1]") WebElement addtocardlink;
	
	
	public addtocard() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickaddtocard()
	
	{ 
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoview();",addtocardlink);
	addtocardlink.click();
	//act.scrollToElement(addtocardlink).click();
		//addtocardlink.click();
	}
	
	public boolean validatecard()
	{
		return addtocardlink.isDisplayed();
		
	}
}