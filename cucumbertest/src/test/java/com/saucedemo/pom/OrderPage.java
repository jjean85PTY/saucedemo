package com.saucedemo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends base {
	
	public OrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By checkLocator = By.xpath("class=\"app_logo\"");
	
	By addBackpacArticleLocator = By.name("add-to-cart-sauce-labs-backpack");
	By addjacketpacArticleLocator = By.name("remove-sauce-labs-fleece-jacket");
	
	By VisitCaritoLocator = By.xpath("//span[@class=\"shopping_cart_badge\"]");
	
	By checkOutLocator = By.name("checkout");
	
	By fnameLacotor = By.name("firstName");
	By lnameLocator = By.name("lastName");
	By zCodeLocator = By.name("postalCode");
	
	By btnLocator = By.name("continue");
	By btnFinish = By.name("finish");
	
	By CompleteCheckLocator = By.xpath("//img[@class=\"pony_express\"]");
	
	
	//List<WebElement> divs = driver.findElements(By.tagName("div"));
	//assertEquals("Sauce Labs Bike Light", divs.get(0).getText());

}
//x.Quality-Stream - https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLTANc8dNOZ7T4jbFBLoD5V-QnhOjGJ7Ym&index=15&t=234s
// https://demo.guru99.com/test/newtours/index.php
