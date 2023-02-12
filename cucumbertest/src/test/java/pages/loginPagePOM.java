package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPagePOM {
	
	WebDriver driver;
	
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	//Create constructors
	
	public loginPagePOM (WebDriver driver) {
		
		this.driver = driver;
		
		// Validate if the page title is correct
		
		  /*
		  if(driver.getTitle().equals("TestProject Demo")) {
		  
		  throw new IllegalStateException("Login Page incorrect. The current page is"
		  +driver.getCurrentUrl()); }
		 
		*/
		
	}
	
		
	public void enterUsername (String username) {
		
		driver.findElement(txt_username).sendKeys(username);	
		
	}
	
	public void enterPassword (String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
		
	}
	
	public void loginValidUser (String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);	
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();		
		
	}
	

}

//1  - Page Object Model | Step by Step
//Fount: https://www.youtube.com/watch?v=BKefIqoUD3w