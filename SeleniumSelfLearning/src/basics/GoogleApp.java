package basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleApp {
	public static void main(String[] args) {
	//System.setProperties("Webdriver.firefoxmarionette","C:\Neha\driver\firefox");
	//System.setProperty("webdriver.gecko.driver","C:\Neha\driver\firefox");
   FirefoxDriver driver =new FirefoxDriver();
   System.setProperty("webdriver.gecko.driver","C:\\Neha\\driver\\firefox");
   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
   capabilities.setCapability("marionette",true);
   //driver= new FirefoxDriver(capabilities);
	
		
	}

}
