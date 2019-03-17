package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Practice_FindElement_rediff {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily");
		//driver.findElement(By.xpath("//a[contains(text(),'Chartered Logistics')]/parent::td/following-sibling::td[4]")).getText();throwing Nosuch Element exception.
	//List <WebElement> list	=driver.findElements(By.xpath("//a[contains(text(),'Chartered Logistics')]/parent::td/following-sibling::td[4]"));
		//List <WebElement> list	=driver.findElements(By.xpath("//a[contains(text(),'Prime Focus')]/parent::td/following-sibling::td[4]"));
		//a[contains(text(),'Prime Focus')]/parent::td/following-sibling::td[4]" 
List<WebElement> list=driver.findElements(By.cssSelector(".dataTable>tbody>tr"));

	System.out.println("Number of Rows in the Table "+ list.size());
	String StockDetails=null;
	String StockPrice=null;
	
	for(int i=0;i<list.size();i++)
{
		
	System.out.println("TR Text::"+list.get(i).getText());
	if(list.get(i).getText().contains("Indowind Energy Ltd."))
	{
		
		StockDetails =list.get(i).getText();
		System.out.println("Row index found::" +i);
		StockPrice=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
		///html/body/div[1]/div[5]/table/tbody/tr[8]/td[1]/a
		break;
	}		

	}
	/**
	 * split the string based on delimeter (space)
	 */
	String StockDetailArray []=StockDetails.split("");
	for(int i=0; i<StockDetailArray.length;i++)
	{
		System.out.print(StockDetailArray[i]);
	}
	System.out.println("StockPrice::"+ StockPrice);

}
}
