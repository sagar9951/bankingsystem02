package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_login_Page {
	//declaration
	@FindBy(xpath="//a[.='Staff Login']")
	private WebElement staffLoginLink ;
	
	@FindBy(name="staff_id")
	private WebElement staffIdField ;
	
	@FindBy(name="password")
	private WebElement staffPassField ;
	
	@FindBy(name="staff_login-btn")
	private WebElement staffLoginBtn ;
	
	
	//initialization
	public Staff_login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}


	
	//utilzation
	public WebElement getStaffLoginLink() {
		return staffLoginLink;
	}


	public WebElement getStaffIdField() {
		return staffIdField;
	}


	public WebElement getStaffPassField() {
		return staffPassField;
	}


	public WebElement getStaffLoginBtn() {
		return staffLoginBtn;
	}
	
	
	
	//Business Logic
	public void staffLogin(String id,String pass) {
		staffLoginLink.click();
		staffIdField.sendKeys(id);
		staffPassField.sendKeys(pass);
		staffLoginBtn.click();
	}
	
	
}
