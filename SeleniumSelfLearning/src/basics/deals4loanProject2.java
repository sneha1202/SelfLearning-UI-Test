package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deals4loanProject2 {
	public static void main(String[] args) {
		System.setProperty("WebDrver.geckodriver", "geckdriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.deal4loans.com/apply-personal-loan-continue.php");
driver.findElements(By.xpath("//a[contains(text(),'HDFC Bank']/parent::td/following-Sibling::td[3]"));

//a[contains(text(),'HDFC Bank')]/parent::td/following-Sibling::td[3]













































));
	}

}
