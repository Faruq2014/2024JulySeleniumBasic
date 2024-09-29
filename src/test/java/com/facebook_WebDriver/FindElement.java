package com.facebook_WebDriver;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	WebDriver driver;
	
	@BeforeEach
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("hgh@dmail.com");
		driver.findElement(By.name("pass")).sendKeys("jhjh");
		driver.findElement(By.name("login")).click();
	}
	
	
	@AfterEach
	public void closeApp() {
		driver.quit();
	}

}
