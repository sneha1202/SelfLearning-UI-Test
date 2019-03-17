package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySelenium {
public static void main(String[] args) {
	
	//System.setProperty("webdriver.gecko.driver","C:\Neha\driver\firefox");
	//System.setProperty("webdriver.firefox.marionette","C:\Neha\driver\firefox");
	WebDriver driver = new FirefoxDriver(); // Launches Firefox Browser with blank url
	driver.get("https://www.google.com"); // Navigates to the specified URL
	String Title = driver.getTitle();
	System.out.println(Title);
	driver.close(); // Closes the Browser
}

}

