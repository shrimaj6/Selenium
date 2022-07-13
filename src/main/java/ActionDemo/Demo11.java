package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("shrimaj1@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#pass")).sendKeys("Shrimaj111");
		Thread.sleep(2000);
		

		//driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		driver.findElements(By.name("sex")).get(1).click();
		driver.close();

	}

}
