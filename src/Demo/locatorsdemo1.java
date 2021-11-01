package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("email");
	    driver.findElement(By.id("pass")).sendKeys("595959");
	    driver.findElement(By.id("u_0_d_CW")).click();
	    Thread.sleep(4000);
	   // driver.findElement(By.linkText("forgate your password"));
	    //driver.findElement(By.partialLinkText("password"));
	}

}
