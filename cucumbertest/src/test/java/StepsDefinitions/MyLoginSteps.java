package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.loginPagePOM;

public class MyLoginSteps {	
	
	
	  WebDriver driver = null;
	  loginPagePOM login;
	  
	  @Given("The new user access to testproject") public void the_new_user_access_to_testproject() {
	  
	  System.out.println("---------SYSTEM STARTED AUTOMATIZACION...");
	  
	  System.out.println("Inside Ste - browser is open");
	  System.setProperty("webdriver.chrome.driver", "C:/Users/jjean/eclipse-workspace/cucumbertest/src/test/resources/driver/chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.navigate().to("https://example.testproject.io/web/");
	  
	  }
	  
	  @When("^user insertar (.*) and (.*)$") public void user_insertar_username_and_password(String username, String password) throws InterruptedException {
	  login = new loginPagePOM (driver);
	  //driver.findElement(By.id("name")).sendKeys(username);
	  login.enterUsername(username);
	  //driver.findElement(By.id("password")).sendKeys(password);
	  login.enterPassword(password);
	  Thread.sleep(3000);
	  
	  }
	  
	  @Then("the user get access to testproject") public void the_user_get_access_to_testproject() throws InterruptedException {
	   
	   login.clickLogin(); 
	  //driver.findElement(By.id("logout")).isDisplayed();
	  //login.checkLogOutIsDisplayed();
	  Thread.sleep(3000); driver.close(); driver.quit();
	   
	  
	  }
	  
	  @And("the new user are able to use the site") public void the_new_user_are_able_to_use_the_site() {
		 
	  login.checkLogOutIsDisplayed();
	  System.out.println("-------------IM IN testproject site "); }
	 


}
	

//365 data science

//2  - Page Object Model | Step by Step

