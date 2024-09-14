package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class Register_Radio_page extends Utility_Functions {
	
	public Register_Radio_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement radioButton;

	public void clickOnRadio() {
		click(radioButton);
	}
}
