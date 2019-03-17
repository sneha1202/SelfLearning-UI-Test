package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandellingWindow {
  private static final TimeUnit TimeUnit = null;

public static void main(String[] args) {
	  
	  System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.rediff.com/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.switchTo().frame("moneyiframe");
	  driver.findElement(By.id("query")).sendKeys("TCS");
	  driver.findElement(By.className("mw001-widget-getquote-btn")).click();
	  driver.switchTo().defaultContent();
	  driver.getTitle();
	  String title=driver.getTitle();
	  System.out.println("Title" + title);
	  
	String parent  =driver.getWindowHandle();
	System.out.println("Parent name  ::" + parent);
	System.out.println("parent window" + parent);
	Set<String> wset=driver.getWindowHandles();
	System.out.println("size of the set" +wset.size()); //2 rediff.com,TCS
	//Now you need to write a logic to ignore rediff.com and consider TCS.So that you can switch to TCS and get the price of TCS.
	//Now to retrieve the value from the set.
	//Enhancer for loop for Set because there is no index determine in case of set, how we will retrie the value in case of set.
	//Enhancer for loop-retreive the element from the data stucture without using index.
	String arr[]= {"abc","def","ghi"};
	for(int i=0;i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	for(String str:arr)
	{
		System.out.println(str);
	}
	String price = null;
	for(String child:wset)
	{
		if(!(child.equals(parent)))//!=i.e not equals to you can use it for datastruct but for object u can not use it
		{
			driver.switchTo().window(child);
			title=driver.getTitle();
			System.out.println("Title of the child window" +title);
			price=driver.findElement(By.id("ltpid")).getText();
			
		}
			
		}
	System.out.println("Price is ::"  +  price);
	driver.switchTo().window(parent);
	}
	
	


}

