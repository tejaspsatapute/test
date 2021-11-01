package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println("driver.switchTo().alert().getText();");

	}

}
