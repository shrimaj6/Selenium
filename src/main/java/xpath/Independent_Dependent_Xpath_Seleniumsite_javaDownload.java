package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		// enter the url
		 driver.get("http://www.seleniumhq.org/download/");
		 Thread.sleep(3000);
		// xpath using independent and dependent concept
		 //driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		 
		 driver.findElement(By.xpath("/html/body/div/main/div[2]/div[2]/div/div/p[1]/a")).click();
	}

}
