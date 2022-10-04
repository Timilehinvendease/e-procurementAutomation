package com.Eprocurement.testcases;

import org.testng.Reporter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Eprocurement.base_Class.BaseClass;
import com.Eprocurement.pagesObjects.LoginPageObjects;

public class LoginTest extends BaseClass{
	
	LoginPageObjects lg;

	@Test(dataProvider="Procurement", priority = 0)
	public void login(String Email, String Password) throws InterruptedException
	{
		
		lg = new LoginPageObjects(driver);	

		lg.setEmail(prop.getProperty("validEmailUser"));
		
		lg.setPassword(prop.getProperty("validPassword"));
	
		lg.clickLogin();
		
		System.out.println("Login Test Passed");
		
	}
	
	
	@DataProvider(name = "Procurement")
	public Object[][] testData() 
	{
		return new Object[][]
				{
			         {"validEmailUser", "validPassword"},
//		             {"validEmailUser", "invalidPassword"},
//			         {"invalidEmailUser", "validPassword"},
//			         {"invalidEmailUser", "invalidPassword"}
				};
	}
}
