package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  
			//to scroll down the page
			js.executeScript("window.scrollBy(0,600 )");
			Thread.sleep(2000);
			
			//to scroll up on page
			js.executeScript("window.scrollBy(600,0 )");
			Thread.sleep(2000);
			 //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", "WebElement");
	        //perform keybord
	        driver.findElement(By.xpath("//input[@value='radio1']")).sendKeys(Keys.ARROW_LEFT);
	        
			

	}

}




/*JavascriptExecutor js=(JavascriptExecutor)driver;

		//to scroll down the page
		js.executeScript("window.scrollBy(0,600 )");
		Thread.sleep(2000);
		
		//to scroll up on page
		js.executeScript("window.scrollBy(600,0 )");
		Thread.sleep(2000);*/
		