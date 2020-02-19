package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class IndiaPost_CalculatePostage {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.indiapost.gov.in/VAS/Pages/CalculatePostage.aspx");
		driver.findElement(
				By.id("ctl00_SPWebPartManager1_g_66dfb396_adb3_4d9b_990a_cf15b7b9428e_ctl00_lblFromFindPincode"))
				.click();
		Thread.sleep(8000);
		
		new Select(driver.findElement(By.id("ctl00_PlaceHolderMain_drpStates"))).selectByValue("Andhra Pradesh");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("ctl00_PlaceHolderMain_drpDistricts"))).selectByValue("Kurnool");
		driver.findElement(By.id("ctl00_PlaceHolderMain_btnSearch")).click();
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

	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

}
