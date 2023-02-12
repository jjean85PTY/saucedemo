package com.saucedemo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage extends base{
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signBtnLocator = By.name("submit");
	
	By homePageLocator = By.xpath("//img[@src=\"images/banner2.gif\"]");
	

	public SignPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn( WebDriver driver) {
		if (isDisplayed(userLocator)) {
			type("standard_user", userLocator);
			type("secret_sauce", passLocator);			
			click(signBtnLocator);
			
		} else {
			
			System.out.println("The text box was not present ");

		}
		
	}
	
	public boolean isHomePageDisplayed() {
		
		return	isDisplayed(homePageLocator);
	}
	
	

}


/* 
 * 
 * https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLTANc8dNOZ7T4jbFBLoD5V-QnhOjGJ7Ym&index=14
 * lluegue hasta minutos 25:00
 */
