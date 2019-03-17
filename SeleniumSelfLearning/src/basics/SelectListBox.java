package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectListBox {
public static void main(String[] args) {
	
System.setProperty("WebDriver.geckodriver", "geckodriver.exe");

WebDriver driver=new FirefoxDriver();

driver.get("https://www.facebook.com");

WebElement e=driver.findElement(By.id("day"));

Select sel=new Select(e);

//sel.selectByVisibleText("Apr");
//sel.selectByValue("4");

sel.selectByVisibleText("11");
sel.selectByValue("14");
sel.selectByIndex(14);//why index is 14 if day index is 0 after that index followed is 14 so index is 14.
//How do we know that how many option are available in list box using any method select.get option is giing a list of webelement.

List<WebElement> optionlist =sel.getOptions();
System.out.println("Number of option::" +optionlist.size());
boolean result=false;
for(int i=0;i<optionlist.size();i++)
{
	optionlist.get(i).click();
	if(optionlist.get(i).getText().equals("150"))//if i reach 15 i stopped,i dont want to select reaming value.
	{
   System.out.println("Match found");
   break;
   }
	else
	{
		
	
	}
	if(result==false)
	{
		System.out.println("Match not found");
	}
	
}
}
}





