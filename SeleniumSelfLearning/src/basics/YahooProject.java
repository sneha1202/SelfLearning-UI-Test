package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class YahooProject {
	public static void main(String[] args) throws Exception  {
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.yahoo.com/");
	WebElement e=driver.findElement(By.id("uh-search-box"));
	e.sendKeys("Selenium");
	Thread.sleep(1000);

		Select sel=new Select(e);
		List<WebElement> optionlist=sel.getOptions();
	System.out.println("Number of option ::"+optionlist.size());
	boolean result=false;
	for(int i=0;i<optionlist.size();i++)
	{
	   optionlist.get(i).getText();
	   if(optionlist.get(i).getText().equals("selenium interview questions"))
	   {
		   System.out.println("Match found");
		   break;
	   }
	  
	   else  
	   {
	  
	   if(result==false)
	    {
		System.out.println("Match.not found");
}
}
	
	//sel.getOptions();
	//driver.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1551352154706_1000\"]")).click();
	
		
		
		
		
		
	}

	}
}
