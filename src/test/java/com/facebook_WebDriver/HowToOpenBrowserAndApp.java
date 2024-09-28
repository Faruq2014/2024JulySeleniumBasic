package com.facebook_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HowToOpenBrowserAndApp {
	 WebDriver  driver;

	public static void main(String[] args) {
		HowToOpenBrowserAndApp op= new HowToOpenBrowserAndApp();
		op.openApplication();
		

	}

	public void openApplication() {
		//how to open browser
		driver= new EdgeDriver();
		//driver= new ChromeDriver();// how to open browser
		//how to open application
		driver.get("https://www.facebook.com/");
		driver.quit();
		

		
	}
}
