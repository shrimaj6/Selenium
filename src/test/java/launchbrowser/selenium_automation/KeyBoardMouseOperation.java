package launchbrowser.selenium_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardMouseOperation {

		public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\geckodriver.exe");
		//1. Launch the browser
		WebDriver driver = new FirefoxDriver();
		//2. enter the url -
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		//Creating an object of Robot Class
		Robot r = new Robot();
		//move the mouse by x and y coordinate
		r.mouseMove(300, 500);
		//press ALT key from keyboard
		r.keyPress(KeyEvent.VK_ALT);
		//press F key from keyboard
		r.keyPress(KeyEvent.VK_F);
		//Release F key from keyboard
		r.keyRelease(KeyEvent.VK_F);
		//Release Alt key from keyboard
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		//Press W key from keyboard to open a new private window
		r.keyPress(KeyEvent.VK_W);
		//Release W key from keyboard
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		// It will close only the current browser window
		//driver.close();
		// It will close all the browser windows opened by Selenium
		driver.quit();
}
}
