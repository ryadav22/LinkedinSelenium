package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PracticePage {
	WebDriver driver;
	public PracticePage(WebDriver driver){
		this.driver=driver;
	}
	
	// element definitions - object repository
	By hondaCheckbox = By.id("hondacheck");
	By BMWCheckbox = By.id("bmwcheck");
	By NameTextBox = By.id("name");
	By ConfirmButton=By.id("confirmbtn");
	By SearchCourseText = By.id("search-courses");
	By SearchCourseButton=By.id("search-course-button");
	By openWindowButton = By.id("openwindow");
	
	//Methods
	public void SearchCourse(String courseName){
//		driver.switchTo().frame("iframe-name");
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(SearchCourseText).sendKeys(courseName);
	}
	
	public void ClickSearchCourseButton(){
		driver.findElement(SearchCourseButton).click();
	}
	
	public void SelectHonda(){
		driver.findElement(hondaCheckbox).click();
	}
	public void SelectBMW(){
		driver.findElement(BMWCheckbox).click();
	}
	
	public void ClickConfirm(){
		driver.findElement(ConfirmButton).click();
	}
	public void EnterName(String name){
		driver.findElement(NameTextBox).sendKeys(name);
	}
	
	public void dismissAlert(){
		driver.switchTo().alert().dismiss();
	}
	
	
	public void switchWindowAndTypeJava(){
		String firstWindow = driver.getWindowHandle();
		driver.findElement(openWindowButton).click();
		Set<String> bothHandles = driver.getWindowHandles();
		for (  String  i: bothHandles){
			if (!(i.equals(firstWindow))){
				driver.switchTo().window(i);
				driver.findElement(By.id("search-courses")).sendKeys("java");
			}
		}
	}
	public void takeScreenshots() throws IOException{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("c:\\rajesh\\myscreenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);

		
	}

}
