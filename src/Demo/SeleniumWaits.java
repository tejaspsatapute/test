package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicite wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//explicite wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		

	}

}




//Implicit Wait
//Explicit Wait
//Fluent Wait
/*	Fluent Wait
Fluent Wait in Selenium is used to define maximum  for the web driver to wait for a condition,
as well as the frequency with which we want to check the condition before throwing 
an "ElementNotVisibleException" exception. 
It checks for the web element at regular intervals until the object is found or timeout happens.*/
/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
		.withTimeout(30, TimeUnit.SECONDS) 			
		.pollingEvery(5, TimeUnit.SECONDS*/