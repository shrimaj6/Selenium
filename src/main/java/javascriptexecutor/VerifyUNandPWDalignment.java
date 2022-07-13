package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUNandPWDalignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/alad/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = driver.findElement(By.name("pwd"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
		System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		}

	}

}
