package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class LoginLandingPage extends Utility_Functions {

	public LoginLandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@class='password']")
	WebElement pwd;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login;
	
	public void enterMail(String value) {
		sendKeys(Email, value);
	}
	public void enterPwd(String value) {
		sendKeys(pwd, value);
	}
	public  void clickLogin() {
		click(login);
	}
}
