package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Desktop\\Selenium jars\\chromedriver.exe");
		//create new object of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> ele =driver.findElements(By.xpath("//td[@class='day']"));
		for(int i=0; i<ele.size(); i++ )
		{
			String eledate=ele.get(i).getText();
			if(eledate.equalsIgnoreCase("26"))
			{
				ele.get(i).click();
				break;
			}
		}
	
			
		}

	}


