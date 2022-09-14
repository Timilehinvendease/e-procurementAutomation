package com.Eprocurement.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Eprocurement.base_Class.BaseClass;
import com.Eprocurement.pagesObjects.Homepage;

public class VerifyHomepageTitleTest extends BaseClass{
	
	
	@Test(priority = 1)
	public void verifyHomepageTitle()
	{ 
		Homepage hmpage = new Homepage();	
		hmpage.getHomepageTitle();		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Vendease";
		Assert.assertEquals(ActualTitle, ExpectedTitle);	
	}
	

}
