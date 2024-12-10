package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginLink = By.className("ico-login");
	By email = By.id("Email");
	By pass = By.id("Password");
	
	public  void clickonLoginLink() {
		driver.findElement(loginLink).click();
	}
	
	public  void enterEmail() {
		driver.findElement(email).sendKeys("nbvsjdhbjck");
	}
	public  void enterPass() {
		driver.findElement(pass).sendKeys("jbbsdjch");
	}
	
}
