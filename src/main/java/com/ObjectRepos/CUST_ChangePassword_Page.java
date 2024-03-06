package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUST_ChangePassword_Page {

	//Declaration
	@FindBy(name="oldpass")
	private WebElement oldpassField ;
	
	@FindBy(name="cnfrm")
	private WebElement cnfrmOldPassField ;
	
	@FindBy(name="newpass")
	private WebElement newpassField ;
	
	@FindBy(name="change_pass")
	private WebElement change_passBtn ;
	
	
	
	//Initializatino
	public CUST_ChangePassword_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization

	public WebElement getOldpassField() {
		return oldpassField;
	}

	public WebElement getCnfrmOldPassField() {
		return cnfrmOldPassField;
	}

	public WebElement getNewpassField() {
		return newpassField;
	}

	public WebElement getChange_passBtn() {
		return change_passBtn;
	}
	
	//BusinessLogic
}
