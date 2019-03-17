package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_GetAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String BaseUrl="https://www.gmail.com";
		driver.get(BaseUrl);
		
		
	}
	

}
