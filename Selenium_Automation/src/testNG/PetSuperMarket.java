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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class PetSuperMarket {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.petsupermarket.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='CC-loginHeader-register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='CC-userRegistrationSubmit']")).click();
		Thread.sleep(5000);
		// CC-userRegistration-firstname-error
		String FirstNameError = driver.findElement(By.xpath("//*[@id='CC-userRegistration-firstname-error']"))
				.getText();
		System.out.println(FirstNameError);
		String LastNameError = driver.findElement(By.xpath("//*[@id='CC-userRegistration-lastname-error']")).getText();
		System.out.println(LastNameError);
		String EmailAddressError = driver.findElement(By.xpath("//*[@id='CC-userRegistration-emailAddress-error']"))
				.getText();
		System.out.println(EmailAddressError);
		String ConfirmEmailAddressError = driver
				.findElement(By.xpath("//*[@id='CC-userRegistration-confirmEmailAddress-error']")).getText();
		System.out.println(ConfirmEmailAddressError);
		String PasswordError = driver.findElement(By.xpath("//*[@id='CC-userRegistration-password-error']")).getText();
		System.out.println(PasswordError);
		String ConfirmPasswordError = driver.findElement(By.xpath("//*[@id='CC-userRegistration-cPassword-error']"))
				.getText();
		System.out.println(ConfirmPasswordError);

		driver.findElement(By.xpath("//*[@id='CC-userRegistration-firstname']")).sendKeys("xy%bm*");
		Thread.sleep(3000);
		String FirstName = driver.findElement(By.xpath("//*[@id='CC-userRegistration-firstname']"))
				.getText();
		System.out.println(FirstName);
		//System.out.println("FirstName = xy%bm*");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-lastname']")).sendKeys("shg$}l");
		//System.out.println("LastName = shg$}l");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-emailAddress']")).sendKeys("pety@sdgsdg.pznx");
		//System.out.println("EmailAddress = pety@sdgsdg.pznx");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-confirmEmailAddress']")).sendKeys("pety@sdgsdg.pznx");
		//System.out.println("ConfirmEmailAddress = pety@sdgsdg.pznx");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-x_orcePhoneNumber']")).sendKeys("2345998760");
		//System.out.println("PhoneNumber = 2345898760");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-password']")).sendKeys("king2shad");
		System.out.println("Password = king2shad");
		driver.findElement(By.xpath("//*[@id='CC-userRegistration-confirmPassword']")).sendKeys("king2shad");
		System.out.println("confirmPassword = king2shad");
		driver.findElement(By.xpath("//*[@id='CC-userRegistrationSubmit']")).click();
		

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
		// driver.quit();
	}

}
