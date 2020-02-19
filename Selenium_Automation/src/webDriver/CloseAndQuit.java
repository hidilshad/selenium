package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.justrechargeit.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Create New Account")).click();

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		//driver.close();//system will close the current window
		driver.quit();//this coomand will close all the related child windows

	}

}
