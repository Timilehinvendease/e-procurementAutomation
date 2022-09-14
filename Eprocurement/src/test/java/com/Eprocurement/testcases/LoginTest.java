package com.Eprocurement.testcases;

import org.testng.Reporter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Eprocurement.base_Class.BaseClass;
import com.Eprocurement.pagesObjects.LoginPageObjects;

public class LoginTest extends BaseClass{
	


	@Test(dataProvider="Procurement", priority = 0)
	public void login(String Email, String Password) throws InterruptedException
	{
		
		LoginPageObjects lg = new LoginPageObjects();	

		lg.setEmail(loc.getProperty("validEmailUser"));
		
		lg.setPassword(loc.getProperty("validPassword"));
	
		lg.clickLogin();
		
		Reporter.log("Login Test Passed");
	
	}
	
	
	@DataProvider(name = "Procurement")
	public Object[][] testData() 
	{
		return new Object[][]
				{
			         {"validEmailUser", "validPassword"},
		             {"validEmailUser", "invalidPassword"},
			         {"invalidEmailUser", "validPassword"},
			         {"invalidEmailUser", "invalidPassword"}
				};
	}
}
