package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagnameLocatorProgram {
	
		public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();	
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html");
			//identify the element 
		WebElement e=driver.findElement(By.tagName("neha"));//write neha in place of input it
		//will throes noschelement exception during run time.
		e.sendKeys("neha");
		
		
		
	}

}
