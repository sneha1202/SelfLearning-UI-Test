package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathFunctionPractice {
	
public static void main(String[] args) {
System.setProperty("WebDriver.geckoDriver","gecko.driver.exe");	
WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
	String actaul=driver.findElement(By.xpath("//a[text()='हिन्दी ']")).getText();
	String expected="हिन्दी";
	}

}
