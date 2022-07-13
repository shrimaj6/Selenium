package launchbrowser.selenium_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void locators() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		WebElement emailElement  = driver.findElement(By.id("email"));
		
		emailElement.sendKeys("shrimaj1@gmail.com");
		Thread.sleep(3000);
		emailElement.clear();
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement firstnameElement  = driver.findElement(By.name("firstname"));
		firstnameElement.sendKeys("Shrimaj");
		Thread.sleep(3000);
		firstnameElement.clear();
		driver.findElement(By.name("lastname")).sendKeys("Mehta");
		//driver.findElement(By.cssSelector("input[value='Mobile number or email address']"));
		driver.findElement(By.id("password_step_input")).sendKeys("New password");
		Thread.sleep(3000);
		driver.findElement(By.id("day")).sendKeys("15");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("june");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("2021");
		
		Thread.sleep(3000);
		driver.close();
	}
}