package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCS {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		   //Xpath syntax-  //tagname[@attribute='value']
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Address");
		// css Selector Syntax- tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("email");
		driver.findElement(By.xpath("(//form[@id='login_form']//input[22]")).sendKeys("12345");
		driver.findElement(By.xpath("//form[@id='login_form']")).click();
	//	driver.findElement(By.)
	
		//Absolute Xpath --it uses complete path from root element---parent-child
	 //Relative xpath--You can simply start by referencing the element you want and go from there.---
		// Relative Xpaths are always preferred as they are not the complete paths from the root element
		//-//a[contains(text(),'Try for Free')]
	}
}
