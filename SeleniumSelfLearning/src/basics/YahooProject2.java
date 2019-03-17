package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooProject2 {
	
	
   public static void main(String[] args) {
	
	
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://in.yahoo.com/?p=us");
	driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li")));
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	System.out.println("AutoSuggest List::"+list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium interveiw questions"))
		{
			list.get(i).click();
			break;
		}
	}
	
	
	
	////*[@id="uh-search-box"]
	
	
}	
	

}
