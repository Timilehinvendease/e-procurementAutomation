package com.Eprocurement.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Eprocurement.base_Class.BaseClass;

public class LogoutTest extends BaseClass{

	
	@Test(priority = 2)
	public void logout()
	{
		WebElement hamburger = driver.findElement(By.xpath(loc.getProperty("hamburgerMenu")));
		hamburger.click();
		WebElement logoutBtn = driver.findElement(By.xpath(loc.getProperty("logoutbutton")));
		logoutBtn.click();
		System.out.println("Logout Successful");
	}
}
