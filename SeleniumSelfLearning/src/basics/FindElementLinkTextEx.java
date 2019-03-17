package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLinkTextEx {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
String BaseUrl="file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/LoginPage.html";
driver.get(BaseUrl);
//WebElement e=driver.findElement(By.linkText("Sign In"));
//Thread.sleep(5000);
//e.click();
 //System.out.println(e.getText());
 //driver.close(); it will close the browser which has current focus.
//driver.quit it will close the driver open by the web driver.
 
// For Partial link text
 WebElement e=driver.findElement(By.partialLinkText("Sign"));
 e.click();
	System.out.println(e.getText());
	driver.quit();
	}
}
