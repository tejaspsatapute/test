package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main (String[] agrs) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
    	driver.navigate().to("https://www.amazon.com/");
    	Thread.sleep(5000);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
	}

}
//System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagyawantp\\Downloads\\chromedriver_win32\\chromedriver.exe");