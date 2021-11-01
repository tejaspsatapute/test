package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get("https://login.salesforce.com/?locale=in");
       driver.findElement(By.id("username")).sendKeys("email");
       driver.findElement(By.id("password")).sendKeys("12345");
       driver.findElement(By.id("Login")).click();
       Thread.sleep(5000);
       driver.findElement(By.linkText("Forgot Your Password?")).click();
       driver.findElement(By.partialLinkText("Password")).click();
    //   driver.findElement(By.xpath())
   
       
	}

}
//hi am tejas
//id,
//name,
//link text,
//partial link text
//xpath,
//css,
//tagname
//classname
//tagname--starting element,   redcolor--attributes, blue color--values