package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageXpath  {
	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
		 
    String baseUrl="https://www.facebook.com";
		   
   driver.get(baseUrl);
  //Test Case 1
    //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Mr Bean");//This is relative xpath starts from html tag.double backward slash.
     //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("fb123");
     
   //driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
   
   //driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();

  //Test Case2
   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7818163704");	   	
   driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
   //Test case 3
   driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
  

	}

}
