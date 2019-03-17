package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandellingListProject3Practice {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement YearSelect=driver.findElement(By.id("year"));
		Select sel=new Select(YearSelect);//In Selenium Api we use Select to find out the item in list.
		sel.selectByVisibleText("Year");
		sel.selectByValue("2018");
		sel.selectByIndex(2);
		List<WebElement> list=sel.getOptions();
		int count=list.size();
		System.out.println("Number of option in the list"+count);
		boolean result=true;
		
		for(int i=0;i<count;i++)
		{
			
			System.out.println(list.get(i).getText());
			String OptionText=list.get(i).getText();
		if(OptionText.equals(116))
		{
			System.out.println("Tc Fails");
			break;
		}
				
	}
	if(result)
	{
		System.out.println("TC Pass");
	}
  
	}
}
