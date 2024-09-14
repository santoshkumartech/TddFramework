package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class ResultPage {
		public ResultPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="(//h3[contains(text(),'Autocar')])[1]")
		public WebElement autocar_link;
		
		public void Link_Click() {
			autocar_link.click();
		}
}
