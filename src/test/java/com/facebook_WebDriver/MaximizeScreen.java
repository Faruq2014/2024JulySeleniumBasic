package com.facebook_WebDriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeScreen {
	WebDriver driver;
	
	@BeforeEach
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().minimize();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
	}
	
	@Test
	public void getFbTitle() {
		String actualTitle="Facebook - log in or sign up";
	String	expectedTitle=driver.getTitle();
	System.out.println("Face book title is >> "+expectedTitle);
	Assertions.assertEquals(actualTitle,expectedTitle, " ** did not match **");
	}
	
	@Test
	public void getFbUrl() {
	String actualUrl="https://www.facebook.com/";
	String expectedUrl=driver.getCurrentUrl();
	System.out.println("Face book url is >> " +expectedUrl);
	Assertions.assertEquals(actualUrl, expectedUrl , " ** did not match **");
	}
	@AfterEach
	public void closeApp() {
		//driver.quit();
	}

}
