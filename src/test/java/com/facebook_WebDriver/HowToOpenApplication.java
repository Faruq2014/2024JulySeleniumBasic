package com.facebook_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToOpenApplication {
	WebDriver driver;
	//WebDriver is the data type
	// driver is the instance variable name
	
	@BeforeMethod
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titleTest() {
		System.out.println("will test latter");
	}
	
}
