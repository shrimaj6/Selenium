package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAttributeActitime {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.komparify.com/users/sign_in");
		
		//xpath using multiple attributes
		String xp = "//input[@id='user_email'][@name ='user[email]']";
		
		Thread.sleep(2000);
		
		//Enter admin into username text box
		driver.findElement(By.xpath(xp)).sendKeys("admin");
		Thread.sleep(2000);
		
		//find password element using xpath by attribute and enter manager in to password textbox.
		driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("manager");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//div[contains(@role,'presentation')]")).click();
		
		//Thread.sleep(2000);
		
		

	}

}
