package com.Eprocurement.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.Eprocurement.base_Class.BaseClass;



public class Homepage extends BaseClass{
	
	By homepageTitle = By.tagName("title");
	
	
	public Homepage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void getHomepageTitle()
	{
		
		WebElement titleTag = driver.findElement(homepageTitle);
		titleTag.getText();
	}

}
