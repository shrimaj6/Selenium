package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextIntoDisabledField {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrim\\eclipse-workspace\\selenium_automation\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("E:\\testing\\html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		//enter "admin" in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		//clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		//enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		//change the second text box to button type using Javascript
		js.executeScript("document.getElementById('t2').type='button'");

		
	}

}
