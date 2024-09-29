package com.facebook_WebDriver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToOpenApplication {
	WebDriver driver;
	//WebDriver is the data type
	// driver is the instance variable name
	
	@BeforeEach
	public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titleTest() {
		System.out.println("will test latter");
	}
	
}
