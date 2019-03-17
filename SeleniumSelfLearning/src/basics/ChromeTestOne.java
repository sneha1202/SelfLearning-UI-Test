package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTestOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com/";
		String expectedTitle = "Google";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		Thread.sleep(5000);
		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
	WebElement e =	driver.findElement(By.name("q"));
	e.sendKeys("This is Test");
    e.getAttribute("n");
    
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
