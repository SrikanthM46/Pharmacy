package apolloPharmacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {
	WebDriver driver;
	
	@BeforeSuite
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void homepage() {
		driver.get("https://www.apollopharmacy.in/");
	}
	
	@Test(priority=1)
	public void login() {
		driver.findElement(By.className("Header_icon___ocd6 icon-userIcon")).click();
	}
	@Test(priority=2)
	public void teleNumber() {
		WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
		tel.sendKeys("9884561272");
	}
	@Test(priority=3)
	public void submit() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=4)
	public void otpVerify() throws InterruptedException {
		WebElement otp = driver.findElement(By.xpath("//input[@type='tel']"));
		Thread.sleep(2000);
		otp.sendKeys("541263");
	}
	@Test(priority=5)
	public void submit1() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}			
