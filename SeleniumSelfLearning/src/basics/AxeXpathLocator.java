package basics;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AxeXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.geckoDriver","gecko.driver.exe");	
		WebDriver driver =new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers");
		
		Thread.sleep(7000);
	
		//WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Zeal Aqua')]/parent::td/following-sibling::td[4]"));
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Jet Airways')]/parent::td/following-sibling::td[1]")); 
			 
			
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
	
		Thread.sleep(5000);

	
//WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'AYM Syntex')]/parent::td/following-sibling::td[4]"));  
		

		//System.out.println(e2.getText());

      driver.close();
	}
	
}

