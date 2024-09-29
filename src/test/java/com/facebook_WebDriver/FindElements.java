package com.facebook_WebDriver;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	WebDriver driver;
	
	@BeforeEach
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void findElementsTest() {
	List<WebElement> pageLinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));	
	int linkSize=pageLinks.size();
	System.out.println(linkSize);
	Assertions.assertSame(linkSize, 34);
	
	for (WebElement webElement : pageLinks) {
		System.out.println(webElement.getText());
	}
	
	
	
	}
	
	
	@AfterEach
	public void closeApp() {
		driver.quit();
	}

}
