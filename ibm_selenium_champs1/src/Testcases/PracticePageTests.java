package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PracticePage;

public class PracticePageTests {
	WebDriver driver;
	PracticePage PP;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "c:\\code\\lib\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
	}
	
	@AfterMethod
	public void cleanup() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void verifyHondaCheckbox() throws InterruptedException, IOException{
		PP = new PracticePage(driver);
		PP.SelectHonda();
		PP.takeScreenshots();		
		PP.EnterName("Rajesh");
		PP.ClickConfirm();

	
		
		PP.dismissAlert();
		PP.SelectBMW();
//		Thread.sleep(5000);
		PP.SearchCourse("java");
		PP.ClickSearchCourseButton();
		PP.switchWindowAndTypeJava();
		
		
	}
	
	
	

}
