package basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethod {
public static void main(String[] args) {
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
 driver.get("http://total-qa.com/live-examples/loginpage/");
   WebElement e=driver.findElement(By.id("username"));
   e.sendKeys("Hello");
  String enteredtext =e.getAttribute("value");
  System.out.println("Enteredtext" + enteredtext);
   System.out.println("id"+e.getAttribute("id"));
   System.out.println("name"+e.getAttribute("name"));
   System.out.println("classname"+e.getAttribute("classname")); 
   e.clear();
   //e.click();
   System.out.println("location"+e.getLocation()); 
   System.out.println("size"+e.getSize());
  System.out.println("color"+e.getCssValue("Background color")); 
  System.out.println("Font size"+e.getCssValue("Font Size")); 
   e.getTagName();
   File srcfile=e.getScreenshotAs(OutputType.FILE);
   System.out.println(srcfile.getAbsolutePath());
   
   
}
}
