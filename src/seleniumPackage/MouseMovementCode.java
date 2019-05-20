package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseMovementCode {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/pramit/Desktop/Selenium Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(3000);
		driver.getTitle();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='DEMO SITES']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		driver.getCurrentUrl();
		driver.getTitle();
		
		
	}

}
