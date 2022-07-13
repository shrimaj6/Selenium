package ActionDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickusingActionsClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://www.facebook.com/");
		//find the ActiTIME Inc. link
		WebElement link = driver.findElement(By.linkText("Create New Account"));
		//right click (context click) on actitime link
//		Actions actions = new Actions(driver);
//		actions.contextClick(link).perform();
//		Thread.sleep(3000);
//		//press 'w' from the keyboard for opening in a new window
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_W);
//		r.keyRelease(KeyEvent.VK_W);
//		
		Thread.sleep(3000);
		//quit() method closes all the browsers opened by Selenium
		driver.quit();


	}

}
