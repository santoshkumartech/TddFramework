package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Utility_Functions;

public class Shopping_Cart extends Utility_Functions {
	
	public Shopping_Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'shopping')]")
	WebElement cart;
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement quantity;
	
	@FindBy(xpath="(//a [contains(text(),'Computing ')])[2]")
	WebElement product;
	
	public void clickCart() {
		click(cart);
	}
	public void changeQuantity(String value) {
		sendKeys(quantity, value);
	}
	public void getText()
	{
		System.out.println(product.getText());
	}
	
}
