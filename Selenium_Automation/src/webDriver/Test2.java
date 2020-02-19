package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.justrechargeit.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Create New Account")).click();

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("mai")).click();
		
		
		

	}

}
