package com.Eprocurement.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Eprocurement.base_Class.BaseClass;

public class LoginPageObjects extends BaseClass{
	
	
	By emailField = By.cssSelector(prop.getProperty("emailInputField"));
	By passwordField = By.cssSelector(prop.getProperty("passwordInputField"));
	By loginBtn = By.cssSelector(prop.getProperty("loginButton"));
	
	

	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public void setEmail(String Email) {
		WebElement email = driver.findElement(emailField);
		email.sendKeys(prop.getProperty("validEmailUser"));
	}

	public void setPassword(String Password) {
		WebElement pass = driver.findElement(passwordField);
		pass.sendKeys(prop.getProperty("validPassword"));
	}

	public void clickLogin() {
		WebElement Btn = driver.findElement(loginBtn);
		Btn.click();
	}
	

}
