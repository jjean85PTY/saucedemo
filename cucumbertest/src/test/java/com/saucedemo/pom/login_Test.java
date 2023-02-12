package com.saucedemo.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class login_Test {
	
	private WebDriver driver;
		RegisterPage LoginPage;
		

	@Before
	public void setUp() throws Exception {
		LoginPage = new RegisterPage(driver);
		driver = LoginPage.chromeDriverConnection();
		LoginPage.visit("https://www.saucedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		LoginPage.Login();
		Thread.sleep(2000);
		assertTrue(LoginPage.isHomePageDisplayed());
		
	}

}
