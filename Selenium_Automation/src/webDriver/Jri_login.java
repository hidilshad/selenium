package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jri_login {

	public static void main(String[] args) throws InterruptedException {
		// cereate webdriver reference name
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.justrechargeit.com/");
		
		
		//click on signin link
		driver.findElement(By.id("jriTop_signin9")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtUserName")).sendKeys("test@gmail.com");
		
		
		//https://ttdsevaonline.com/#/registration
		
		
		

	}

}
