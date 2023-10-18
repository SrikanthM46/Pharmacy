package apolloPharmacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckList {
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
	public void checkItemList() {
		driver.findElement(By.className("Header_icon___ocd6 Header_cart__Juw0v icon-cart_icon"));
		WebElement actCheckList = driver.findElement(By.xpath("(//span[text()='1'])[3]"));
		
		Assert.assertEquals("1",actCheckList);
		System.out.println(driver.findElement(By.xpath("(//span[text()='1'])[3]")).getText());
	}
	@Test(priority=2)
	public void CreditCheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

}
