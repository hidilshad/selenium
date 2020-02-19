package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://shearcircle.com/customer/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.findElement(By.linkText("About Us")).click();
		// driver.quit();
		String abc = driver.findElement(By.id("sub_content")).getText();
		System.out.println(abc);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		 String xyz=driver.findElement(By.xpath("//em[@for='firstname']")).getText();
		 System.out.println(xyz);
		 //Thread.sleep(3000);
		//String text = driver.findElement(By.x("lastname")).getText();
		//System.out.println(text);
		 System.out.println(driver.findElement(By.xpath("//h1[text()=' Join Now']")).getText());
		//h1[text()=' Join Now']
	}

}
