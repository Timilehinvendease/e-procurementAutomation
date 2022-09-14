package com.Eprocurement.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Eprocurement.base_Class.BaseClass;

public class captureScreenshot extends BaseClass {

	public void getScreenshot() throws IOException {
		Date currendate = new Date();
		String screenshotfilename = currendate.toString().replace(" ", "-").replace(":", "-");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//" + screenshotfilename + ".png"));
	}

}
