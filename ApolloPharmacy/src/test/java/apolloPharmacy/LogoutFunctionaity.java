package apolloPharmacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoutFunctionaity {
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
	public void logout() {
		driver.findElement(By.className("Header_icon___ocd6 icon-userIcon")).click();
	}
	@Test(priority=2)
	public void logoutbtn() {
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
	}
}
