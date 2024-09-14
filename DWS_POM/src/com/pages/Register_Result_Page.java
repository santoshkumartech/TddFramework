package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class Register_Result_Page extends Utility_Functions {

	public Register_Result_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	public void firstNameData(String value)
	{
		sendKeys(firstName, value);
	}
}
