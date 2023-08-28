package model;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeout {
	WebDriver driver;
	WebDriverWait wait;

	public Timeout(WebDriver driver) {
		this.driver = driver;
	}

	public void timeOut() {
		try {
			Thread.sleep(2000);
		} catch ( InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Alert alertWait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	public void waitForEl(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	

}
