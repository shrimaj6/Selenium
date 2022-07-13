package launchbrowser.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://login.yahoo.com/");

		//1. Id:
		
//	WebElement username	= driver.findElement(By.id("login-username"));
//	username.sendKeys("ajaylad@yahoo.com");
//	
//	WebElement nextBtn	= driver.findElement(By.id("login-signin"));
//	nextBtn.click();
		
	
	//2. name
	
//	driver.findElement(By.name("username")).sendKeys("ajaylad@yahoo.com");
//	driver.findElement(By.name("signin")).click();
	
	//3. xpath:
	
//	driver.findElement(By.xpath("//input[@id=\'login-username\']")).sendKeys("ajaylad@yahoo.com");
//	driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();
	
	//4. cssSelector	
//	driver.findElement(By.cssSelector("#login-username")).sendKeys("ajaylad@yahoo.com");
//	driver.findElement(By.cssSelector("#login-signin")).click();
	
	//5. Linktext : only for link
		
	//driver.findElement(By.linkText("Help")).click();
	
	//6. PartialLinkText: only for links.
		
	//driver.findElement(By.partialLinkText("Create")).click();
		
	//7. class name: 
		driver.findElement(By.className("phone-no")).sendKeys("ajaylad@yahoo.com");
	}

}
