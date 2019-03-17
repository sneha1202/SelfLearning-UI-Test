package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   public class FaceebookP {
	
  public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");

   WebDriver driver=new ChromeDriver();
 
   String baseUrl="https://www.facebook.com";
   
   driver.get(baseUrl);
   
     WebElement e =driver.findElement(By.id("u_0_c"));
      e.sendKeys("Aanvi");
     e = driver.findElement(By.id("u_0_e"));
      e.sendKeys("Pandey");
    e = driver.findElement(By.id("u_0_h"));
     e.sendKeys("test@gmail.com");
     Thread.sleep(2000);
    e = driver.findElement(By.id("u_0_k"));
    e.sendKeys("test@gmail.com");
    Thread.sleep(2000); 
    driver.close();
   
   
	
	}

}
