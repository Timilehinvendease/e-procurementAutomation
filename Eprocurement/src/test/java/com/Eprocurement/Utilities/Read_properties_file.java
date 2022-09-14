package com.Eprocurement.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.Eprocurement.base_Class.BaseClass;

public class Read_properties_file extends BaseClass {
	

	public void ReadPropertiesFile () throws IOException
	{
		Properties prop = new Properties();
		FileInputStream configFile = new FileInputStream(System.getProperty("user.dir")+ "/dos/src/test/resources/config_fIle/configuration.properties");
		FileInputStream locatorsFile = new FileInputStream(System.getProperty("user.dir") + "/dos/src/test/resources/config_fIle/locators.properties");		
		prop.load(configFile);
		prop.load(locatorsFile);
	    prop.getProperty("browser");
		prop.getProperty("testUrl");
	}

}
