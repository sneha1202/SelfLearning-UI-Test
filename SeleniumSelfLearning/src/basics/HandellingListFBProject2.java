package basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandellingListFBProject2 {
	public static void main(String[] args) {
		System.setProperty("WebDriver.geckodriver", "geckpdriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	WebElement daySelect=driver.findElement(By.id("day"));		
	Select sel=new Select(daySelect);
	sel.selectByVisibleText("Day");
	sel.selectByIndex(4);
	sel.selectByValue("5");
	List<WebElement> list=sel.getOptions();
	int count=list.size();
	System.out.println("Number of option in the list:::"+count);
	boolean result=true;
	for(int i=0;i<count;i++)
	{
		System.out.println(list.get(i).getText());
		String optionText=list.get(i).getText();
		if(optionText.equals("29"))
		{
			result=false;
			System.out.println("TC Fails");
			break;
		}
	}
	if(result)
	{
		System.out.println("TC Pass");
	}
			
		
	}

}
