package model;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Browser_Alerts {
	WebDriver driver;
	Timeout time = new Timeout(driver);

	public Browser_Alerts(WebDriver driver) {
		this.driver = driver;
	}
	public void accept() {
		Alert alert = time.alertWait();
		alert.accept();

	}
	public void accept(String value) {
		Alert alert = time.alertWait();
		alert.sendKeys(value);
		alert.accept();

	}
	public void dismiss() {
		Alert alert = time.alertWait();
		alert.dismiss();

	}
}
