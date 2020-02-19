package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting_Dil {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(6000);
		driver.findElement(By.name("fName")).sendKeys("Dilanshu");
		Thread.sleep(6000);
		driver.findElement(By.name("lName")).sendKeys("Mehata");
		driver.findElement(By.id("indiMobile")).sendKeys("0778894567");
		driver.findElement(By.name("address1")).sendKeys("kendrick Rd");
		driver.findElement(By.name("address2")).sendKeys("Earley");
		driver.findElement(By.name("cityS")).sendKeys("Leads");
		driver.findElement(By.name("countryS")).sendKeys("United Kingdom");
		Thread.sleep(5000);
		driver.findElement(By.name("statesS")).sendKeys("abcd");
		driver.findElement(By.name("proofS")).sendKeys("PAN card");
		driver.findElement(By.name("proofId")).sendKeys("12345678");
		driver.findElement(By.name("emailId")).sendKeys("hiramana@yahoo.com");
		driver.findElement(By.name("zipCode")).sendKeys("RG1 4AY");
		driver.findElement(By.name("password")).sendKeys("Sr@vya9");
		driver.findElement(By.name("repassword")).sendKeys("Sr@vya9");

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

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\broserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\broserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("please give valid browser name");
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
