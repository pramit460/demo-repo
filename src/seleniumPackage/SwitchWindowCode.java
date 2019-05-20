package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindowCode {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/pramit/Desktop/Selenium Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(3000);
		
        Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='DEMO SITES']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		Iterator<String> it = allwindows.iterator(); 
		
		String parentwindowId=it.next();
		System.out.println("parent window id is :" + parentwindowId);
		
		String childwindowId=it.next();
		System.out.println("child window id is :" + childwindowId);

		driver.switchTo().window(childwindowId);
		//driver.manage().window().maximize();
		driver.getTitle();
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindowId);
		driver.getTitle();
		driver.quit();
	}

}
