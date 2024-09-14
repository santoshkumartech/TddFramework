package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class Dws_Register_page2 extends Utility_Functions {
	
	public Dws_Register_page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@id='gender-female']")
	WebElement radio_button;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname_text;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname_text;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email_text;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwd_text;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement cpwd_text;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement click_register;
	
	public void Click_radioButton() {
		click(radio_button);
	}
	public void Enter_value_in_fn(String value) {
		sendKeys(firstname_text, value);
	}
	public void Enter_value_in_ln(String value) {
		sendKeys(lastname_text, value);
	}
	public void Enter_value_in_email(String value) {
		sendKeys(email_text, value);
	}
	public void Enter_value_in_password(String value) {
		sendKeys(pwd_text, value);
	}
	public void Enter_value_in_cpassword(String value) {
		sendKeys(cpwd_text, value);
	}
	public void Click_registerButton() {
		click(click_register);
	}
}
