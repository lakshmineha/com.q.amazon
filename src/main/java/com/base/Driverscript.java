package com.base;

import java.io.File;
import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import net.sourceforge.tess4j.Tesseract;

public class Driverscript {
	 public  static WebDriver driver;
	Properties pro;
	
	public Driverscript() 
	{
		
	


try 
{
	File file = new File("./config/config.properties");
	FileInputStream fis = new FileInputStream(file);
	pro = new Properties();
	pro.load(fis);
}
catch(Exception e) 
{
	System.out.println("unable to load the properties file");
	e.printStackTrace();
}
}



	
	
	public void setup()
	
	{
		String br=pro.getProperty("broswer");
		if(br.trim().equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (br.trim().equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		
		}
		else
		{
			System.out.println("Unsupported Browser Type!");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		geturl();
	}
	
		public void geturl()
		{
	
		String url=pro.getProperty("url");
		// WebElement link=driver.findElement(By.xpath("//div[@class='a-row a-text-center']"));
		 
		 //driver.findElement(By.id("captchacharacters")).click();
		driver.get(url);
		 //Tesseract image=new Tesseract();
		// image.

	}
		public void quitDrive() throws InterruptedException
		{Thread.sleep(3000);
			driver.quit();
			
		}

}

