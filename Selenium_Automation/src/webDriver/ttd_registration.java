package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ttd_registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\broserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(5000);
		
		driver.findElement(By.name("fName")).sendKeys("Dilanshu");
		Thread.sleep(1000);
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

}
