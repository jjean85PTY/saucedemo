package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginSaucedemoPage;

public class LoginSaucedemoStep {
		
			WebDriver driver=null;
		loginSaucedemoPage login;
  
	    @Given("the user open the browser")
		public void the_user_open_the_browser() {
			
			System.setProperty("webdriver.chrome.driver","C:/Users/jjean/eclipse-workspace/cucumbertest/src/test/resources/driver/chromedriver.exe");
			
			driver = new ChromeDriver();
		  
		}
		
		@And("user the access to saucedemo website")
		public void user_the_access_to_saucedemo_website() {
			
			driver.navigate().to("https://www.saucedemo.com/");

		}

		@When("^instert the(.*) and (.*)$")
		public void instert_the_username_and_password(String username, String password) throws InterruptedException {
			
			login = new loginSaucedemoPage(driver);
			
			login.enterUsername(username);
			login.enterPassword(password);
			
			Thread.sleep(2000);
		    
		}
		
		@Then("the user loging into saucedemo homepage")
		public void the_user_loging_into_saucedemo_homepage() {
			
			login.checkLogutIsDisplay();
			
		     
		}

		@And("can see all saucedemo product")
		public void can_see_all_saucedemo_product() throws InterruptedException {
			
			login.loginValidUser(null, null);
			
			System.out.println("IM IN THE HOME PAGE");
			
			Thread.sleep(2000);
			
			login.checkLogutIsDisplay();
			driver.close();
			driver.quit();
		     
		}
		
		

}
