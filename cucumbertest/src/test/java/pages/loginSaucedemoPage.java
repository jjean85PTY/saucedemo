package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginSaucedemoPage {
	
	
	  WebDriver driver;
	  
	  By txt_usrname = By.id("user-name"); By txt_password = By.id("password"); By
	  btn_login = By.id("login-button"); By btn_logout =
	  By.id("logout_sidebar_link");
	  
	  //Constructor to login public loginSaucedemoPage(WebDriver driver){
	  
	  this.driver = driver; //this.btn_login = (By) driver; --added by me JT }
	  
	  public void enterUsername(String username) {
	  
	  driver.findElement(txt_usrname).sendKeys(username);
	  
	  }
	  
	  public void enterPassword (String password){
	  
	  driver.findElement(txt_password).sendKeys(password); }
	  
	  public void clickLogin() throws InterruptedException{
	  
	  
	  driver.findElement(btn_login).click(); Thread.sleep(2000);
	  
	  }
	  
	  public void checkLogutIsDisplay(){
	  
	  driver.findElement(btn_logout).isDisplayed(); 
	  
	  }
	  
	  public void loginValidUser(String username, String password) {
	  
	  driver.findElement(txt_usrname).sendKeys(username);
	  driver.findElement(txt_password).sendKeys(password);
	  driver.findElement(btn_login).click();
	  
	  }
	 
}
