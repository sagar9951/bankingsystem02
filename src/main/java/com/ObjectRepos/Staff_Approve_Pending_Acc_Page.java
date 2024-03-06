package com.ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Staff_Approve_Pending_Acc_Page {

	//declaration
	@FindBy(name="application_no")
	private WebElement applicationNumField ;
	
	@FindBy(name="search_application")
	private WebElement searchBtn ;
	
	@FindBy(xpath="//tbody/tr[2]")
	private WebElement tableData;

	@FindBy(name="approve_cust")
	private WebElement apprveBtn ;
	
	
	//initilization
	public Staff_Approve_Pending_Acc_Page(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	
	//utilization

	public WebElement getApplicationNumField() {
		return applicationNumField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getApprveBtn() {
		return apprveBtn;
	}
	
	public WebElement getTableData() {
		return tableData;
	}
		
	//business Logic
	
	
}
