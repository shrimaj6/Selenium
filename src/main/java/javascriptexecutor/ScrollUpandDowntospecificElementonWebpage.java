package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDowntospecificElementonWebpage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.get("http://seleniumhq.org/download");
		
		//click on the close icon of the yellow color background pop up
		//driver.findElement(By.id("close")).click();
		
		//driver.findElement(By.id("close")).click();
		
		// find the Applitools element on the webpage
		
		//WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]\"))"));
		
		
		
		// get the X-coordinate and store in a variable
		
		//int x = ele.getLocation().getX();
		
		// get the Y-coordinate and store in a variable
		//int y = ele.getLocation().getY();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Scroll to Applitools element’s x and y coordinate
		//js.executeScript("window.scrollBy("+x+", "+y+")");
		//Thread.sleep(3000);
		
		
		///////////////-------------////////////////
		
		driver.findElement(By.id("close")).click();
		//select an element which is present at the bottom of the page
		WebElement element = driver.findElement(By.id("footerLogo"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();


	}

}
