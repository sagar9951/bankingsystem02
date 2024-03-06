package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_delete_customer_Ac_Page {

	//declaration
	@FindBy(name="customer_account_no")
	private WebElement accountField ;
	
	@FindBy(name="Cust_ac_Id")
	private WebElement Cust_Id_Field ;
	
	@FindBy(name="reason")
	private WebElement reasonField ;
	
	@FindBy(name="delete")
	private WebElement deleteBtn ;
	
	//initilization
	public Staff_delete_customer_Ac_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization

	public WebElement getAccountField() {
		return accountField;
	}

	public WebElement getCust_Id_Field() {
		return Cust_Id_Field;
	}

	public WebElement getReasonField() {
		return reasonField;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	//businesss logic
}
