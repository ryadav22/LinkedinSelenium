package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninPage {
	WebDriver driver;
	
	//constructor
	public SigninPage(WebDriver driver){
		this.driver=driver;
	}
	
	// element definitions -- Object repository
	By email = By.id("username");
	By errorText = By.xpath("//div[contains(@id,'error-for')]");
	By forgotPassword = By.linkText("Forgot password?");
	
	// method definitions
	// set email
	public void setEmail(String emailid){
		driver.findElement(email).sendKeys(emailid);
	}
	// get error text
	public String getErrorText(){
		String error = driver.findElement(errorText).getText();
		return error;
	}
	// click forgot password
	public void clickForgotPassword(){
		driver.findElement(forgotPassword).click();
	}
	
	// verify the error text
	public void verifyErrorText(String expectedError, String actualError){
		Assert.assertEquals(actualError, expectedError);
	}

}
