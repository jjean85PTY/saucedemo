package com.saucedemo.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends base {
	
	
	// https://demo.guru99.com/test/newtours/   --no confio en el sitio
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src=\"images/mast_register.gif\"]");
	
	By usrLocator = By.name("email");
	By passLocator = By.name("password");
	By ConfirmPassLocator = By.name("confirmPassword");
	
	By loginLacator = By.name("submit");
	By registerMesaage = By.tagName("font");
	
	
	public RegisterPage (WebDriver driver) {
		super(driver);
	}
	
	public void Login() throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(2000);		
		if (isDisplayed(registerPageLocator)) {		
			type("test2", usrLocator);
			type("secret_sauce", passLocator);
			type("secret_sauce", ConfirmPassLocator);
			Thread.sleep(2000);
			click(loginLacator);
			
		}else {
			System.out.println("Username and password do not match any user in this service");
		}

	}
	/*
	public boolean isHomePageDisplayed() {
		return isDisplayed(registerPageLocator);
	}
	
	*/
	
	public String registeredMessage() {
		
		List<WebElement> fonts = findElements(registerMesaage);
		return getText(fonts.get(5));
		
	}
	
}

//2.Quality-Stream - https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLTANc8dNOZ7T4jbFBLoD5V-QnhOjGJ7Ym&index=15&t=234s
