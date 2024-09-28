package com.facebook_WebDriver;

import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookWebDriver implements WebDriver{

	@Override
	public void get(String url) {
		// this method for open application
		
	}

	@Override
	public @Nullable String getCurrentUrl() {
		// this method for validate url
		return null;
	}

	@Override
	public @Nullable String getTitle() {
		// this method for validate title
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// this method for finding elements
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// this method for finding element
		return null;
	}

	@Override
	public @Nullable String getPageSource() {
		// this method for page source// barely used
		return null;
	}

	@Override
	public void close() {
		// this method for close app
		
	}

	@Override
	public void quit() {
		// this method for quit app
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// this method for open app
		
		return null;
	}

	@Override
	public Options manage() {
		// this method for open app with options
		
		return null;
	}

}
