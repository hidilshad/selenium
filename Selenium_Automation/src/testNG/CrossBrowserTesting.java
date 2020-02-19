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

public class CrossBrowserTesting {
	public WebDriver driver;

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

	@Test
	public void f() {
		driver.get("https://fb.com");
		driver.findElement(By.id("email")).sendKeys("test@sdgsdg.csdf");
		driver.findElement(By.name("pass")).sendKeys("alphhabet");
		driver.findElement(By.id("loginbutton")).click();
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

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
