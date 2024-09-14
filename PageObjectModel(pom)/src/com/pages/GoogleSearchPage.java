package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Utility_Functions;

public class GoogleSearchPage extends Utility_Functions{
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@title='Search']")
	public WebElement search_text;
	
	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	public WebElement search_button;
	
	public void Enter_searchText(String value) {
		sendKeys(search_text, value);
	}
	public void Click_searchButton() {
		click(search_button);
		
	}


}
