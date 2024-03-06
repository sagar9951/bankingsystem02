package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_View_Customer_by_Ac_page {
	//declaration
	@FindBy(name="account_no")
	private WebElement accntField ;
	
	@FindBy(name="submit_view")
	private WebElement submitBtn;
	
	//initialization
	public 	Staff_View_Customer_by_Ac_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	public WebElement getAccntField() {
		return accntField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
		
		
	//business logic
		
}
