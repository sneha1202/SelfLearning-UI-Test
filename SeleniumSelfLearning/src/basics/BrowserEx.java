package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserEx {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.gecko.driver","gecko.driver.exe");
		//open the browser without opening url
		FirefoxDriver driver=new FirefoxDriver();
		//Enter the  url
		driver.get("http://www.indeed.co.in");
		//Retrieve the title
		String title=driver.getTitle();
		//Print the title in console
		System.out.println("Title of the page" + title);
		//Close the browser
	String  url	=driver.getCurrentUrl();
	
		System.out.println("url is"+ url);
	String source=driver.getPageSource();//To reteiver the page source of html.This method also returm string.
		//Thse method available in web Driver interface, which are abstract,implemented in firefox driver.We are seeing selenium webdriver method.
	System.out.println(source);
		
		
		driver.close();
		
	}

}
