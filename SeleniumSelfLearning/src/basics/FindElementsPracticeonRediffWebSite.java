package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsPracticeonRediffWebSite {
	public static void main(String[] args) {
		//System.out.println("The Program has started:::");
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily");
		
	List<WebElement> Stocklist=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	System.out.println("The number of Stocks::"+ Stocklist.size());
	
	for(int i=0;i<Stocklist.size();i++)	
	{
	String StockName =Stocklist.get(i).getText();
	if(StockName.equals("T T Ltd."))
	{
		System.out.println(" Row number is " + (i+1));
	String currentPrice=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[4]")).getText();
	//driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr"+(i+1)+"/td[3]")).getText();
	System.out.println("Current price "+ currentPrice);
		break;
	}
}
}
}