package apolloPharmacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyMedicine {
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
	public void searchbox() {
		WebElement search = driver.findElement(By.id("searchProduct"));
		search.sendKeys("zandu balm");
		search.click();
	}
	@Test
	public void medicine() {
		WebElement item = driver.findElement(By.xpath("(//p[@class='ProductCard_productName__vXoqs'])[1]"));
		item.click();
	}

}
