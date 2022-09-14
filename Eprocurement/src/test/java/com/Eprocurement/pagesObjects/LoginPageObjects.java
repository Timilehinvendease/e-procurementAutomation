package com.Eprocurement.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Eprocurement.base_Class.BaseClass;

public class LoginPageObjects extends BaseClass{
	
	
	By emailField = By.cssSelector(loc.getProperty("emailInputField"));
	By passwordField = By.cssSelector(loc.getProperty("passwordInputField"));
	By loginBtn = By.cssSelector(loc.getProperty("loginButton"));
	

	public void setEmail(String Email) {
		WebElement email = driver.findElement(emailField);
		email.sendKeys(loc.getProperty("validEmailUser"));
	}

	public void setPassword(String Password) {
		WebElement pass = driver.findElement(passwordField);
		pass.sendKeys(loc.getProperty("validPassword"));
	}

	public void clickLogin() {
		WebElement Btn = driver.findElement(loginBtn);
		Btn.click();
	}

}
