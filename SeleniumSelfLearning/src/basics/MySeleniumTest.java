package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MySeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.gecko.driver","C://Neha//gecko_driver/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.google.com");
		driver.close();
		
		
		
		
		
	}

}
