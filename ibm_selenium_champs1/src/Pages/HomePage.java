package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	//constructor
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	// Webelement definitions  --- Object Repository
	By userName = By.id("login-email");
	By password = By.id("login-password");
	By signIn = By.id("login-submit");
	
	// Methods applicable on this page
	// entering username
	public void setUsername(String userid){
		driver.findElement(userName).sendKeys(userid);
	}
	// entering password
	public void setPassword(String pwd){
		driver.findElement(password).sendKeys(pwd);
	}
	// clicking sign in 
	public void clickSignIn(){
		driver.findElement(signIn).click();
	}
	
	// user sign in 
	public void userSignIn(String userid, String pwd){
		setUsername(userid);
		setPassword(pwd);
		clickSignIn();
	}
	
}
