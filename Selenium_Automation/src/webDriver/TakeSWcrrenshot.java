package webDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSWcrrenshot {

	public static void main(String[] args) throws Exception {
		
		//get the system date
		Date d = new Date();
		System.out.println(d);//Tue Dec 03 18:12:33 GMT 2019

		//Change the system format
		//ddMMMyyyy_HHmmss
		DateFormat myFormat = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = myFormat.format(d);
		System.out.println(timeStamp);
		
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.schoolvacancies.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		String path = "D:\\dilshad\\TestingFiles\\Selenium\\WorkSpace\\Selenium_Automation\\Screenshots\\";
		//system will take screenshot and send this file to your RAM location
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//move screenshot from srcFile to target
		FileHandler.copy(srcFile, new File(path+"test"+timeStamp+".PNG"));
		
		System.out.println("done***************");
		
		
		

	}

}
