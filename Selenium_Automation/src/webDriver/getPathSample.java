package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPathSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.xe.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("")).click();
		Thread.sleep(6000);
		 driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("69");
		 Thread.sleep(3000);
		String xyz = driver.findElement(By.xpath("//*[@id='amount']")).getAttribute("value");
		System.out.println(xyz);

	}

}
