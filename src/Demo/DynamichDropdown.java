package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamichDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("//input[@value='Chennai (MAA)']")).click();
		*/
		//# Home Work:
		//driver.findElement(By.xpath("//input[@id='autosuggest']")).click();
		
	    driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
	    List<WebElement> ob2=driver.findElements(By.xpath("//input[@id='autosuggest']"));
	 //   List<WebElement> element=(List<WebElement>) driver.findElement(By.xpath("//input[@id='autosuggest']"));
	    
	    
		
	}

}
