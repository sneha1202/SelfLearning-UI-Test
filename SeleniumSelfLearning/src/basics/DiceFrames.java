package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DiceFrames {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.dice.com/");
		System.out.println("Title " + driver.getTitle());
		
	driver.findElement(By.id("search-field-keyword")).clear();
	driver.findElement(By.id("search-field-keyword")).sendKeys("Selenium");
	driver.findElement(By.id("search-field-keyword")).clear();
	List<WebElement> list =driver.findElements(By.xpath("//*[@id=\\\"search-field-keyword\\\"]"));	
		System.out.println(list.size());

		
		
		
		
	}

}
