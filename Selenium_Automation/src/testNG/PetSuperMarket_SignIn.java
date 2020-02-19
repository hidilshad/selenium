package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class PetSuperMarket_SignIn {
	public WebDriver driver;

	@Test

	public void f() throws InterruptedException {
		driver.get("https://www.petsupermarket.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='CC-loginHeader-login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='CC-login-input']")).sendKeys("pety@sdgsdg.pznx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='CC-login-password-input']")).sendKeys("king2shad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='CC-userLoginSubmit']")).click();
		//System.out.println("successfully logged in");
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Date d = new Date();
		System.out.println(d);// Tue Dec 03 18:12:33 GMT 2019
		DateFormat myFormat = new SimpleDateFormat("ddMMMyyyy_HH mm ss");
		String timeStamp = myFormat.format(d);
		System.out.println(timeStamp);
		String path = null;
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(".\\Screenshot2\\" + "test" + timeStamp + ".PNG"));
		System.out.println("ScreenShot done");
	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
