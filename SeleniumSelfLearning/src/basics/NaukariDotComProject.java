package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukariDotComProject {

	public static void main(String[] args) {
	
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String parent  =driver.getWindowHandle();
		
		System.out.println("parent window" + parent);
		Set<String> wset=driver.getWindowHandles();
		System.out.println("size of the set" +wset.size());
		
		String price = null;
		String title=null;
		
		for(String child:wset)
		{
			if(!(child.equals(parent)))//!=i.e not equals to you can use it for datastruct but for object u can not use it
			{
				driver.switchTo().window(child);
				if(driver.getTitle().contains("HCL"))
				{
				
				title=driver.getTitle();
				System.out.println("Title of the child window" +title);
				price=driver.findElement(By.id("ltpid")).getText();
		
		
				}
			}
		}
		
		System.out.println("Price is ::" + price);
			
		
	}
}
		
		
	
	

