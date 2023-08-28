package model;

import org.openqa.selenium.By;

public class Locators {
	public static  String homePageUrl = "https://www.daraz.com.bd";
	public static  String pageTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";

	//login
	public static By loginclick = By.xpath("//a[contains(text(),'Signup / Login')]");
	public static By enterUserName = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public static By enterPassword = By.xpath("//input[@type='password']");
	public static By loginButtonClick = By.xpath("//button[@type='submit']");
	public static By notifiPopUpHost = By.cssSelector(".airship-html-prompt-shadow");
	public static By notInterestedButtonClick = By.cssSelector(".airship-btn.airship-btn-deny");
}
