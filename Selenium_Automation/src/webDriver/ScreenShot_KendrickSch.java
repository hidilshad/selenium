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

public class ScreenShot_KendrickSch {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
				Date d = new Date();
				System.out.println(d);//Tue Dec 03 18:12:33 GMT 2019
				
				DateFormat myFormat = new SimpleDateFormat("ddMMMyyyy_HH mm ss");
				
				String timeStamp = myFormat.format(d);
				
				System.out.println(timeStamp);
				
				WebDriver driver;
				
				System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
				driver.get("https://www.kendrick.reading.sch.uk/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(6000);
				
				String path;
				try {
					path = "D:\\dilshad1\\TestingFiles\\Selenium\\WorkSpace\\Selenium_Automation\\Screenshot2\\";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					path = "D:\\dilshad\\TestingFiles\\Selenium\\WorkSpace\\Selenium_Automation\\Screenshot2\\";
				}
				
				File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileHandler.copy(srcFile, new File(path+"test"+timeStamp+".PNG"));
				
				System.out.println("ScreenShot done");
		

	}

}
