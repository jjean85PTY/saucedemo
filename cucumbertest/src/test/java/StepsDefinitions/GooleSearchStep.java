package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

//public class GooleSearchStep {
//
//	WebDriver driver = null;
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Ste - browser is open");
//		System.setProperty("webdriver.chrome.driver","C:/Users/jjean/eclipse-workspace/cucumbertest/src/test/resources/driver/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Ste - user is on google search page");
//		driver.navigate().to("https://www.google.com");
//	}
//
//	@When("user enter a text in search box")
//	public void user_enter_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside Ste - user enter a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(400);
//	}
//
//	@And("hit enter")
//	public void hit_enter() {
//		System.out.println("Inside Ste - browser is openuser enter a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is nagigate to search results")
//	public void user_is_nagigate_to_search_results() {
//		System.out.println("Inside Ste - user enter a text in search box");
//		
//		driver.getPageSource().concat("Online Course");
//		
//		driver.close();
//		driver.quit();
//	}
//}
