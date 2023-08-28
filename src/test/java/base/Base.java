package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

	@BeforeSuite
	public WebDriver setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}

