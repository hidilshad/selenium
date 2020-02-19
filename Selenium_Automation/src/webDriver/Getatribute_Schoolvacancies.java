package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getatribute_Schoolvacancies {

	public static void main(String[] args) throws Exception {
		//
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.schoolvacancies.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.name("postcode")).sendKeys("TW167EF");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.name("postcode")).getAttribute("value"));
		//driver.findElement(By.name("postcode")).sendKeys("TW167EF");
		System.out.println(driver.findElement(By.name("postcode")).getAttribute("placeholder"));
		
		
	}

}
