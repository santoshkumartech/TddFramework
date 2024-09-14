package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class Dws_Register_Page extends Utility_Functions {
	
	public Dws_Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement register_link;
	
	public void Click_registerLink() {
		click(register_link);
	}

}