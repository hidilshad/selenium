package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		
		//first find the element, then do action
		//type Email
		driver.findElement(By.id("email")).sendKeys("test@sdgsdg.csdf");
		driver.findElement(By.name("pass")).sendKeys("alphhabet");
		driver.findElement(By.id("loginbutton")).click();
		
		
		driver.close();

	}

}
