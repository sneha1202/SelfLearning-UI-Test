package basics;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathAxisLocatorFunctions {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers");
		////a[contains(text(),'Cybertech System')]/parent::td/following-sibling::td[4]"
		
		//WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Jet Airways')]/parent::tbody/following-sibling::td[4]"));
		//WebElement e =driver.findElement(By.xpath("//a[text()='Jet Airways']"));
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Jet Airways')]/parent::td/following-sibling::td[3]"));
		//WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[5]/table/tbody/tr[2]/td[1]/a"));
		//WebElement e=driver.findElement(By.xpath("//a[contains(@class,'f14')]"));
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