package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleAppEx {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.firefox.marionette","C:\\Neha\\driver\\firefox");	
	//System.setProperty("webdriver.gecko.driver", "C:/Users/hp/Downloads");
	//WebDriver driver = new WebDriver();
	WebDriver driver=new FirefoxDriver();
	//String baseurl="http://www.google.com";
    driver.get("http://www.google.com");//1 methods
    String expected="google";
    String actual=driver.getTitle();//2nd methods as part of driver.get and get title
    if(actual.equals(expected))
    {
    	System.out.println("testcase passed");
    }
    else
    {
    	System.out.println("testcase failed");
    }
	
	}
}


