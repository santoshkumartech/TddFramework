package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class LoginPage extends Utility_Functions {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement login_link;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email_text;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password_text;
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement remember_button;
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login_button;
	
	public void Click_Login_Link() {
		click(login_link);
	}
	public void Enter_value_in_email(String value) {
		sendKeys(email_text, value);
	}
	public void Enter_value_in_pwd(String value) {
		sendKeys(password_text, value);
	}
	public void Click_remember() {
		click(remember_button);
	}
	public void Click_login() {
		click(login_button);
	}

}
