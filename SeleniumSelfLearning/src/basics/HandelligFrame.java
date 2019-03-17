package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelligFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/Frames.html");
		System.out.println("Title ::" + driver.getTitle());
		//switch to a frame
		driver.switchTo().frame("frame_c");
		driver.findElement(By.id("frame3txt")).clear();
		driver.findElement(By.id("frame3txt")).sendKeys("in frame3");
		//Navigate to top Window.
		driver.switchTo().defaultContent();//its page4
		
		       //switch to b frame
				driver.switchTo().frame("frame_b");
				driver.findElement(By.id("frame2txt")).clear();
				driver.findElement(By.id("frame2txt")).sendKeys("in frame2");
				//Navigate to top Window.
				driver.switchTo().defaultContent();
				
				//switch to b frame
				driver.switchTo().frame("frame_a");
				driver.findElement(By.id("frame1txt")).clear();
				driver.findElement(By.id("frame1txt")).sendKeys("in frame1");
				//Navigate to top Window.
				driver.switchTo().defaultContent();
				
		
	}

}
