package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_Credit_customer_Page {
	
	//declaration
	@FindBy(name="customer_account_no")
	private WebElement accountField ;
	
	@FindBy(name="credit_amount")
	private WebElement ammountField ;
	
	@FindBy(name="credit_btn")
	private WebElement creditBtn ;
	
	//initilization
	public Staff_Credit_customer_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getAccountField() {
		return accountField;
	}

	public WebElement getAmmountField() {
		return ammountField;
	}

	public WebElement getCreditBtn() {
		return creditBtn;
	}
	
	//business logic
}
