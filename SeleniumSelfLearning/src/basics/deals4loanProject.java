package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deals4loanProject {

	public static void main(String[] args) {
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.deal4loans.com");
		//driver.findElement(By.xpath("///html/body/header/nav/div/div[2]/ul/li[1]/a")).click();
       driver.findElement(By.id("personalloan")).click();
       System.out.println("Test Run");
		///html/body/header/nav/div/div[2]/ul/li[1]/a
		
	}
}
