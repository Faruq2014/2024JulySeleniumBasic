package com.facebook_inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LinkTest extends BaseTest{


	@Test
	public void linkTest() {
		driver.findElement(By.linkText("Espa�ol")).click();
		String actualTitle="Facebook - Inicia sesi�n o reg�strate";
		String expectedTtile=driver.getTitle();
		Assertions.assertEquals(actualTitle, expectedTtile);
		
		
	}
}
