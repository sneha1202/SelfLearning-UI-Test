package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

   public class SeleniumAPIFrames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.geckodriver", "WebDriver.geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		System.out.println("title ::"+driver.getTitle());
		//This line is applicable to where ever its failing due to timeout,inspite of writing thread.sleep at every linesee below
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		//Thread.sleep(5000); i just comment it beacuse inspite of this we can write driver.manage...
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.className("title")).getText());
		driver.switchTo().defaultContent();
		
		
	}

}
