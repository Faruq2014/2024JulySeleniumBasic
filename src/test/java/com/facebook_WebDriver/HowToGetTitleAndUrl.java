package com.facebook_WebDriver;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetTitleAndUrl {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		HowToGetTitleAndUrl gt= new HowToGetTitleAndUrl();
		gt.openApp();
		gt.getFbTitle();
		gt.closeApp();
		
		gt.openApp();
		gt.getFbUrl();
		gt.closeApp();
	}
	
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void getFbTitle() {
		String actualTitle="Facebook - log in or sign up";
	String	expectedTitle=driver.getTitle();
	System.out.println("Face book title is >> "+expectedTitle);
	Assertions.assertEquals(actualTitle,expectedTitle, " ** did not match **");
	}
	
	public void getFbUrl() {
	String actualUrl="https://www.facebook.com/";
	String expectedUrl=driver.getCurrentUrl();
	System.out.println("Face book url is >> " +expectedUrl);
	Assertions.assertEquals(actualUrl, expectedUrl , " ** did not match **");
	}
	
	public void closeApp() {
		driver.quit();
	}
	

}
