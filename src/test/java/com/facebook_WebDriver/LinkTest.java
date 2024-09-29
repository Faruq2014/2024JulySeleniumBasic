package com.facebook_WebDriver;



import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
	WebDriver driver;
	
	@BeforeEach
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void linkTest() {
		driver.findElement(By.linkText("Español")).click();
		String actualTitle="Facebook - Inicia sesión o regístrate";
		String expectedTtile=driver.getTitle();
		Assertions.assertEquals(actualTitle, expectedTtile);
		
		
	}
	
	
	@AfterEach
	public void closeApp() {
		driver.quit();
	}

}
