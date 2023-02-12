/*
package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginDemoPOM;





public class LoginDemoPOM1234 {
	
	WebDriver driver = null;
	LoginDemoPOM login;
		

	//@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside Step - Browser is opening...");
	    
	    String projectPath = System.getProperty("user.dir");
	    System.out.println("Project path is:" +projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    
	    
	}

	//@And("user is on login page")
	public void user_is_on_login_page() {
	    
		driver.navigate().to("https://example.testproject.io/web/");
	}

	//@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginDemoPOM (driver);
		
		login.enterUsername(username);
		login.enterPassword(password);	
		login.clickLogin();
		login.loginValidUser(username, password);
		Thread.sleep(2000);
	}

	//@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
			
		
	    
		login.clickLogin();
		
		System.out.println("You are on testproject login page");
		System.out.println("---------------TEST END-------------------");
	}

	
}

*/
