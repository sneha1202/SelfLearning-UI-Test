package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffProject {

	///html/body/div[1]/div[5]/table/tbody/tr[19]/td[1]/a
	//a[contains(text(),'Force Motors')]/parent::td/following-sibling::td[3]
	public static void main(String[] args) {
		System.setProperty("WebDriver.geckodriver", "geckdriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.findElement(By.xpath("//a[contains(text(),'Kenvi Jewels')]")).click();
		///html/body/div[1]/div[5]/table/tbody/tr[12]/td[1]/a
		
	}
}
