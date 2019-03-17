package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class ContainFunction {
		public static void main(String[] args) {
			System.setProperty("WebDriver.geckoDriver","gecko.driver.exe");	
			WebDriver driver =new FirefoxDriver();	
			driver.get("http://www.facebook.com");//Contain function takes 2 parameter first text and then part of it(text).
		String actual=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]")).getText();
		String expected="Connect with friends and the world around you on Facebook";
		System.out.println("actual is" +actual);
		System.out.println("expected is" +expected);
		if(actual.equals(expected))
		{
			//contains can be useful for the content of  attribute value.you can use part of it in the case
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
			
			boolean result =(actual==expected);
					
			driver.findElements(By.xpath("//input[contains(@class,'_58mg')]"));		
		}
	}

}
