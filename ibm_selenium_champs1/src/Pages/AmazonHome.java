package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHome {
	
	WebDriver driver;
	
	public AmazonHome(WebDriver driver){
		this.driver=driver;
	}
	
	// element definitions - Object Repository
	By signIn = By.xpath("(//span[@class='nav-line-1'])[2]");
	By yourOrders = By.xpath("//span[@class='nav-text'][text()='Your Orders']");
	
	// Methods
	public void clickYourOrder(){
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(signIn)).build().perform();
		driver.findElement(yourOrders).click();
		
	}
	

}
