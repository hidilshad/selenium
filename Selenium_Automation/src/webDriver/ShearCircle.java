package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShearCircle {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		 throws Exception {

				// TODO Auto-generated method stub
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://shearcircle.com/register");
			Thread.sleep(3000);
				driver.findElement(By.linkText("About Us")).click();
               // driver.quit();
				
				Thread.sleep(3000);
				
				driver.findElement(By.linkText("Contact Us")).click();
				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("Partner ")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Privacy Policy")).click();
				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("Postings")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Terms and Conditions")).click();
				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("Why ")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Feedback")).click();
				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("Billing ")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("FAQs")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Join Our Team")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Testimonials")).click();
				driver.quit();

	

	}
}
