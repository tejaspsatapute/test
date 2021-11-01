package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(4000);
        driver.getCurrentUrl();
        System.out.println( driver.getCurrentUrl());
        driver.getTitle();
        System.out.println( driver.getTitle());
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
	}

}
