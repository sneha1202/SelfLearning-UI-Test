package basics;

     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.support.ui.Select;

    public class FaceBookSignupPage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Neha\\driver\\chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	String BaseUrl="https://www.facebook.com";
	driver.get(BaseUrl);
	
	WebElement e0=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/h2"));
	WebElement e=driver.findElement(By.xpath("//*[@id=\"u_0_c\"]"));
	e.sendKeys("Bear");
	WebElement e1=driver.findElement(By.xpath("//*[@id=\"u_0_e\"]"));
	e1.sendKeys("peterson");
	WebElement e2=driver.findElement(By.xpath("//*[@id=\"u_0_h\"]"));
	e2.sendKeys("Test123@gmail.com");
	WebElement e3=driver.findElement(By.xpath("//*[@id=\"u_0_k\"]"));
	e3.sendKeys("Test123@gmail.com");
	
	WebElement e4=driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
	e4.sendKeys("Bp@123");
	WebElement e5=driver.findElement(By.id("month"));
	e5.sendKeys("Febuary");
	WebElement e6=driver.findElement(By.id("day"));
	e6.sendKeys("14");
	WebElement e7=driver.findElement(By.id("year"));
	e7.sendKeys("1984");
	//WebElement e8=driver.findElement(By.id("u_0_9"));
	//e8.click();
	WebElement e9=driver.findElement(By.id("u_0_a"));
	e9.click();
	WebElement e10=driver.findElement(By.id("u_0_u"));
	e9.click();
	Thread.sleep(5000);
	driver.close();
	//Select date = new Select(driver.findElement(By.xpath("id('day')")));
    //date.selectByVisibleText("24");
	//WebElement e5=driver.findElement(By.xpath("//*[@id=\"day"));
    //Select date=new Select(driver.findElement(By.id("day")));
    //date.selectByVisibleText("12");
   // Select month = new Select(driver.findElement(By.xpath("id('month')")));
   // month.selectByVisibleText('Dec');
   // Select month=new Select(driver.findElement(By.id("month")));
   // month.selectByVisibleText("oct");
    //Select year = new Select(driver.findElement(By.xpath("id('year')")));
    //year.selectByVisibleText("1989");
   
    
    
	}
}
