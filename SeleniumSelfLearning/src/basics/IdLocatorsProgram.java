package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocatorsProgram {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();	
	driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html");
	//identify the element 
    WebElement e=driver.findElement(By.id("username"));//find element return the webelement.	
		e.sendKeys("neha");
		// i want to retrieve the text entered in text box
		//</input id="username" value="neha"
	String s=e.getAttribute("value");//this value called attribute here.in selenium we want to retrieve value that is getattribut.
	System.out.println(s);
	WebElement e1=driver.findElement(By.id("pass word"));
	e1.sendKeys("neha123");
	WebElement e2=driver.findElement(By.id("login"));
	e2.click();
		
	}

}
