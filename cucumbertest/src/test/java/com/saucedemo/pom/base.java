package com.saucedemo.pom;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	private WebDriver driver;
	
	public base(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jjean/eclipse-workspace/cucumbertest/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements (By locator) {
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By loginLacator) {
		driver.findElement(loginLacator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			
			return driver.findElement(locator).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		
	}
	
	public void visit(String url) {
		driver.get(url);
	}

}

//1.Quality-Stream - https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLTANc8dNOZ7T4jbFBLoD5V-QnhOjGJ7Ym&index=15&t=234s