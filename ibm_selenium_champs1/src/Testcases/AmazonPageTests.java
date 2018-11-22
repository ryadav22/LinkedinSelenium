package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AmazonHome;

public class AmazonPageTests {

	WebDriver driver;
	AmazonHome AH;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\code\\lib\\browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

	@AfterMethod
	public void cleanup() throws InterruptedException {
//		Thread.sleep(10000);
//		driver.close();
	}

	@Test
	public void verifyOrders() {
		AH = new AmazonHome(driver);
		AH.clickYourOrder();
	}

}
