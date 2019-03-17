package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class HandellingListBox {
public static void main(String[] args) {
	System.setProperty("WebDriver.geckodriver","geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
   WebElement monthSelect	=driver.findElement(By.id("month"));
	Select sel=new Select(monthSelect);
	sel.selectByVisibleText("Month");
	sel.selectByIndex(2);
	sel.selectByValue("5");
	//to verify the paticular option is a part of the listbox----
	List<WebElement> list =sel.getOptions();//when you call get option you get the list of getoption.
	//Display the number of item in the list.no of array in lenght i.e array.lenght
	int count=list.size();//this will give the count name..Array we use index to refer the values
	//in list we try to call a method to refer to  a each and every value stored at particular index means we call
	//list.getof index so try write a for loop..
	
	System.out.println("Number of item in the list:::"+ count);
	boolean result=true;
	for(int i=0;i<count;i++)
	{
		System.out.println(list.get(i).getText());
		//How do you verify paticular option is available or not
		
		String optionText=list.get(i).getText();
		if(optionText.equals(32))
		{
			result=false;
			System.out.println("TC fails");
			break;
		}
	}
	if(result)
	{
		System.out.println("TC pass");
	}
	
	
	
	
	
	
}
}
