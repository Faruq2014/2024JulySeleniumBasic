package com.facebook_inheritance;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest{


	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("hgh@dmail.com");
		driver.findElement(By.name("pass")).sendKeys("jhjh");
		driver.findElement(By.name("login")).click();
	}
}
