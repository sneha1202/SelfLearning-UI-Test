package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {

	public static void main(String[] args) {
		
	System.setProperty("WebDriver.geckoDriver","gecko.driver.exe");	
		WebDriver driver =new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=296985387669172&extra_1=s%7Cc%7C322135479804%7Ce%7Cfacebook%20create%20account%7C&placement=&creative=322135479804&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D1667656791%26adgroupid%3D63650031319%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-309327057760%26loc_physical_ms%3D9001953%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIhYaFiK6V4AIVA-DICh1TvQCLEAAYASAAEgJU0_D_BwE");
	//String actual=driver.findElement(By.xpath("//span[text()='create an account']")).getText();
	//String actual=driver.findElement(By.xpath("//*[@id=\"u_0_c\"]/span")).getText();
	String expected="Create a New Account";
	//String actual=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]")).getText();
	String actual=driver.findElement(By.xpath("//div[text()='Create a New Account']")).getText();
	
	System.out.println("actual " + actual);
	System.out.println("expected " + expected);
	
	if(actual.equals(expected))
	{
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("Test case fails");
	}
		
	boolean result=(actual==expected);
	
	System.out.println("Result is"+result);
	}
}
	
