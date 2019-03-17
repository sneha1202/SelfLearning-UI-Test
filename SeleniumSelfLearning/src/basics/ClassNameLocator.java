package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

     public class ClassNameLocator {
	  public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html");
		WebElement e=driver.findElement(By.className("textboxcolor"));
		e.sendKeys("abc");
		
		
		
		
	}

}
