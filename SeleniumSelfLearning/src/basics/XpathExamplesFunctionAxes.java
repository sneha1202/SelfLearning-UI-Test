package basics;

import java.util.NoSuchElementException;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExamplesFunctionAxes {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckoDriver","gecko.driver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers/nse/daily/nifty");
		
		WebElement e=driver.findElement(By.xpath("//a[contains(text(),'UPL')]/parent::td/following-sibling::td[2]"));
		WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Zee Entertainment En')]/parent::td/following-sibling::td[2]"));
		try
		{
			if(e2.isDisplayed())
		{
			
				String price= e2.getText();
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
			//driver.close();
			

		}
	

}

