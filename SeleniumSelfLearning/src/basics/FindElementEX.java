package basics;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementEX {
public static void main(String[] args) {
	
	FirefoxDriver driver=new FirefoxDriver();
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	driver.get("https://money.rediff.com/gainers/bse/daily");
 //WebElement e=driver.findElementByXPath("//a[contains(text(),'Swan Energy Ltd')]/parent::td/following-sibling::td[4]");
	////a[contains(text(),'Jet Airways')]/parent::td/following-sibling::td[3]
//List <WebElement> list  =driver.findElementsByXPath("//a[contains(text(),'Swan Energy Ltd')]/parent::td/following-sibling::td[4]");
List <WebElement> list  =driver.findElementsByCssSelector(".dataTable>tbody>tr");

System.out.println("Numbers of Rows in the Table " + list.size());

for(int i=0; i <list.size(); i++)
{
	System.out.println("TR Text::"+list.get(i).getText());
}


//try   
//{
//	if(e.isDisplayed())
//	{
//		
//		String price= e.getText();
//		System.out.println("Stock Price " + price);
//	}
//	}
//	catch(NoSuchElementException ex)
//	{
//		System.out.println("Stock Name Not Exists " + ex.getMessage());
//	}
//
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();

	
	
}



}

