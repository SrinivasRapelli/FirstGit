package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class BasePage {

	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
