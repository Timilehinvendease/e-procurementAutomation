package com.Eprocurement.base_Class;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;





public class BaseClass {
	
	public WebDriver driver = null;
	public static Properties prop = new Properties();
	public static FileReader configFile;
	public static FileReader locatorsFile;
	
	

	@BeforeTest
	public void setUp() throws IOException {
		
		if (driver == null)
		{
		    configFile = new FileReader(System.getProperty("user.dir") + "/src/test/resources/configuretion.properties/configfile.properties");
//		    locatorsFile = new FileReader(System.getProperty("user.dir")+ "//src//test//resources//configuretion.properties//locators.properties");
			prop.load(configFile);
//			loc.load(locatorsFile);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testUrl"));
		}

		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testUrl"));
		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}


