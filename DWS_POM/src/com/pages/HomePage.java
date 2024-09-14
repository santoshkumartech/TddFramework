package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Functions;

public class HomePage extends Utility_Functions {
	
	public  HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement register;
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement login;
	
	@FindBy(xpath="//span[contains(text(),'Wishlist')]")
	WebElement wishlist;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement sendText;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement search;
	
	public void clickOnRegister()
	{
		click(register);
	}
	public void clickOnLogin()
	{
		click(login);
	}
	public void clickWishlist()
	{
		click(wishlist);
	}
	public void search(String text) {
		sendKeys(sendText, text);
	}
	public void clickSearch() {
		click(search);
	}
	
}
