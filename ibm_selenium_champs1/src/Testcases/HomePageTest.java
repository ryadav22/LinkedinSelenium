package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SigninPage;

public class HomePageTest {
	WebDriver driver;
	HomePage HP;
	SigninPage SP;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "c:\\code\\lib\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com");
	}
	
	@AfterMethod
	public void cleanup(){
		driver.close();
	}

	@Test
	public void verifyRightEmailWrongPassword(){
		String expectedError = "Hmm, that's not the right password. Please try again or request a new one.";
		HP = new HomePage(driver);
		SP = new SigninPage(driver);
		HP.userSignIn("rajesh@us2.co.in", "rajesh123");
		String actualError = SP.getErrorText();
		SP.verifyErrorText(expectedError, actualError);
		
	}
	
	@Test
	public void verifyWrongEmail(){
		String expectedError = "Hmm, we don't recognize that email. Please try again.";
		HP = new HomePage(driver);
		SP= new SigninPage(driver);
		HP.userSignIn("rajeshhhhhhhhh@us2.co.in", "rajesh123");
		String actualError =SP.getErrorText();
		SP.verifyErrorText(expectedError, actualError);
	}
	
}
