package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		WebElement a=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		System.out.println(a.isSelected());
		System.out.println(a.isDisplayed());
		System.out.println(a.isEnabled());
				List<WebElement> obj= driver.findElements(By.xpath("//input[@type='checkbox']"));
		obj.size();
		System.out.println(obj.size());
		for(WebElement element:obj)
		{
			element.click();
		}*/
	/*	List<WebElement> b= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement element:b) {
			if(element.getAttribute("value").equalsIgnoreCase("option1"))
			{
				element.click();
				break;
			}
		
		}*/
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		WebElement b=driver.findElement(By.xpath("//input[@value='radio1']"));
		b.isSelected();
		System.out.println(b.isSelected());
		b.isDisplayed();
		System.out.println(b.isDisplayed());
		b.isEnabled();
		System.out.println(b.isEnabled());
		
		
		
        /*#List<WebElement> obj1= driver.findElements(By.xpath("//input[@type='radio']"));
        obj1.size();
        Thread.sleep(4000);
        System.out.println( obj1.size());
        
        for(WebElement element:obj1)
        {
        	element.click();
        }
       
		/*driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		Thread.sleep(1500);*/
		
	}
}
