package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

     public class GmailP {
	 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String baseUrl="https://www.google.com/gmail/about/#";
		String ExpectedTitle="Gmail";
		String actualTitle="";
		
		driver.get(baseUrl);
		Thread.sleep(5000);
		actualTitle=driver.getTitle();
		
	if(actualTitle.contentEquals(ExpectedTitle)) {
		System.out.println("The test case is passed");
	}
	else
		
	{
		System.out.println("The test case is fail");
	
	}
		
	}
     }


