package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggest {
	//@Test(description="Auto Suggest")
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
	////*[@id="header-search-form"] //ul[@role='listbox']//li"
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
	////*[@id="yui_3_18_0_3_1551570012055_957"]
	List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	System.out.println("Auto Suggest List::"+list.size());
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium interview questions"))
		{
			list.get(i).click();
			System.out.println("Match found");
			break;
		}
		else
		{
			System.out.println("Match not found");
		}
	}
	}

}
