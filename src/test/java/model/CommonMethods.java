package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickOnButton(By btn) {
		driver.findElement(btn).click();
	}

	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public int getSize(By element) {
		return driver.findElements(element).size();
	}
	
	public List<WebElement> getEls(By element) {
		return driver.findElements(element);
	}

	public void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);

	}
	
	public void shadowDomPopUp(By host, By btn) {
		WebElement shadowDomHostElement = driver.findElement(host);
		// Finding the ShadowRoot in a WebElement 
		SearchContext context = shadowDomHostElement.getShadowRoot();
		// finding the targeted element
		context.findElement(btn).click();
	}
	
	public void selectitem(By element, String visibleText) {
		Select selectItems = new Select(driver.findElement(element));
		selectItems.selectByVisibleText(visibleText);
	}
	
	public void listitem(By element, String visibleText) {
		List<WebElement> listItems =  driver.findElements(element);
		for(WebElement item : listItems) {
			if(item.getText().equals(visibleText)) {
				item.click();
				break;	
			}
		}
	}
	
	public void highlighter(By element) {
		WebElement el = driver.findElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background: beige');", el);
		
	}



}
