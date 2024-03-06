package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_Profile_Page {

	//declaration
	@FindBy(name="home")
	private WebElement homeBtn;
	
	@FindBy(name="logout_btn")
	private WebElement logoutBtn;
	
	@FindBy(name="viewdet")
	private WebElement viewActiveCustomers;
	
	@FindBy(name="view_cust_by_ac")
	private WebElement viewCust_by_ac;
	
	@FindBy(name="apprvac")
	private WebElement approveAc;
	
	@FindBy(name="del_cust")
	private WebElement delCustAc;
	
	@FindBy(name="credit_cust_ac")
	private WebElement creditCust_ac;
	
	
	
	//initialization
	public Staff_Profile_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//utilization

	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getViewActiveCustomers() {
		return viewActiveCustomers;
	}

	public WebElement getViewCust_by_ac() {
		return viewCust_by_ac;
	}

	public WebElement getApproveAc() {
		return approveAc;
	}

	public WebElement getDelCustAc() {
		return delCustAc;
	}

	public WebElement getCreditCust_ac() {
		return creditCust_ac;
	}
	
	//Business Logic
	public void staffLogout() {
		logoutBtn.click();
	}
	
}
