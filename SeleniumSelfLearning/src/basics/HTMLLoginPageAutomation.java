package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTMLLoginPageAutomation {
	public static void main(String[] args) {
		
	
		System.setProperty("gecko.Driver","gecko.driver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html");
		String title=driver.getTitle();
		System.out.println("title is"+title);
		String url=driver.getCurrentUrl();
		System.out.println("url is" +url);
		WebElement e=driver.findElement(By.id("username"));
		e.sendKeys("neha");
		WebElement e1=driver.findElement(By.id("pass word"));
		e1.sendKeys("Ns@7818163704");
		WebElement e2=driver.findElement(By.id("login"));
		e2.click();
		
		System.out.println("Testcase pass");
	}

}
