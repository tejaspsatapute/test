package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	    Set<String> obj5=driver.getWindowHandles();//will return parent window and child window
	    Iterator<String> h=obj5.iterator();
	    String ParentWindow=h.next();//to store parent window
	    String ChildWindow=h.next();// to store child window
	    driver.switchTo().window(ChildWindow);//it will switch control to child window
	    driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	    Thread.sleep(1000);
	    driver.switchTo().window(ParentWindow);//it will switch control to parent window
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='radio1']")).click();

	}

}
