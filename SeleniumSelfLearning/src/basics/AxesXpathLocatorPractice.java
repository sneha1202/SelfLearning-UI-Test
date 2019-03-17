package basics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AxesXpathLocatorPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckoDriver", "gecko.driver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
	WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Cybertech System')]/parent::td/following-sibling::td[4]"));
	
	try
	{
		if(e.isDisplayed())
		{
			
			String price= e.getText();
			System.out.println("Stock Price " + price);
		}
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("Stock Name Not Exists " + ex.getMessage());
		}
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
