package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Utility_Functions;

public class Books_Page extends Utility_Functions {
	
	public Books_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	WebElement books;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement addToCart;
	
	@FindBy(xpath="//p[@class='content']")
	WebElement msg;
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	WebElement grid;
	
	public void clickBook() {
		click(books);
	}
	public void clickAddToCart() {
		click(addToCart);
	}
	public void printMsg() {
		msg.getText();
	}
	public void selectGrid(String text) {
		usingText(grid, text);
	}
}
