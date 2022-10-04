package com.Eprocurement.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Eprocurement.base_Class.BaseClass;
import com.Eprocurement.pagesObjects.Homepage;

public class VerifyHomepageTitleTest extends BaseClass{
	
	
	@Test(priority = 1)
	public void verifyHomepageTitle()
	{ 
		Homepage hmpage = new Homepage(driver);	
		String ExpectedTitle = "Vendease";
		hmpage.getHomepageTitle();		
		String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ActualTitle, ExpectedTitle);	
	    Reporter.log(ActualTitle);
	}
	

}
