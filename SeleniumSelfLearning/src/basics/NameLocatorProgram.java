package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocatorProgram {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html");
		WebElement e=driver.findElement(By.name("username"));
		e.sendKeys("abc");
		
		WebElement e1=driver.findElement(By.name("password"));
		e1.sendKeys("aani123");
		WebElement e2=driver.findElement(By.name("login"));
		e2.click();
	}

}
