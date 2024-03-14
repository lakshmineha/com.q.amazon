package com.pages;






import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import com.base.Driverscript;

public class searchpage  extends Driverscript
{
	@FindBy(id="twotabsearchtextbox") WebElement searchdropdownbox;
@FindBy(id="nav-search-submit-text") WebElement submitlink;

public searchpage()
{
	
		PageFactory.initElements(driver, this);
	}

public searchproductresultpage searchdropdownbox( String product)
{
	searchdropdownbox.sendKeys(product);
	submitlink.click();
	return  new searchproductresultpage(); 
}




}
	




