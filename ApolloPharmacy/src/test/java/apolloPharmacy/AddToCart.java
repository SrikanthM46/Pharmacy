package apolloPharmacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
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
	
	@Test
	public void addItem() {
		driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
	}

}
