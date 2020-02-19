package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class PetSM_AddToBasket {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.petsupermarket.com/");
		Thread.sleep(8000);
		//Click on Sign link
		driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='CC-login-input']")).sendKeys("pety@sdgsdg.pznx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='CC-login-password-input']")).sendKeys("king2shad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='CC-userLoginSubmit']")).click();
		Thread.sleep(8000);
		//Move mouse poineter to element
		//Using actions will overcome that
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='shop by pet']"));
		act.moveToElement(ele).build().perform();;
		
		

	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

}
